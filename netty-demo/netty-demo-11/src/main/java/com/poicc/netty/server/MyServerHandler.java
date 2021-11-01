package com.poicc.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;

import java.nio.charset.StandardCharsets;

/**
 * @description: MyServerHandler
 * @author: crq
 * @create: 2021-11-01 22:27
 **/
public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if (msg instanceof HttpRequest) {
            DefaultHttpRequest request = (DefaultHttpRequest) msg;
            System.out.println("URI:" + request.uri());
            System.err.println(msg);
        }

        if (msg instanceof HttpContent) {
            LastHttpContent httpContent = (LastHttpContent) msg;
            ByteBuf byteData = httpContent.content();
            if (!(byteData instanceof EmptyByteBuf)) {
                //接收msg消息
                byte[] msgByte = new byte[byteData.readableBytes()];
                byteData.readBytes(msgByte);
                System.out.println(new String(msgByte, StandardCharsets.UTF_8));
            }
        }

        String sendMsg = """
                我一直在拼一块拼图 却总是拼错
                然后我发现应该先拼小星空 再拼大宇宙 不然无从下手
                正当我满心欢喜 以为即将要拼出来的时候 却发现有一块怎么都拼不对
                仔细排查 原来里面有些小块不是我的 是别人图上的
                同时还有人跟我说 你这么拼是不对的 你要拼个圆形 不是方形
                到底要怎么拼呢？我唉声叹气过很多夜晚
                除了继续钻研 别无他法
                或许是坚持起了作用 或许是冷静起了作用 或许是别的
                我逐渐找到了框架 和我想象的非常不一样
                它不是方形的星空 也不是圆形的宇宙 它是一对翅膀
                此时突然像开了窍一样 把它安在了我自己的肩膀上
                义无反顾的飞出了这个迷茫了很久的地方
                去到了另外一个陌生的领地
                开始了一段新的迷茫
                迷茫它是种常态
                不管图是啥样 只要抱有对生活的热情 就可以拼出来
                博客：https://poicc.github.io""";

        FullHttpResponse response = new DefaultFullHttpResponse(
                HttpVersion.HTTP_1_1,
                HttpResponseStatus.OK,
                Unpooled.wrappedBuffer(sendMsg.getBytes(StandardCharsets.UTF_8)));

        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain;charset=UTF-8");
        response.headers().set(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        ctx.write(response);
        ctx.flush();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        cause.printStackTrace();
    }
}
