package com.poicc.netty.aio.client;

import com.poicc.netty.aio.ChannelAdapter;
import com.poicc.netty.aio.ChannelHandler;

import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * @description: 客户端消息处理器
 * @author: crq
 * @create: 2021-10-30 23:39
 **/
public class AioClientHandler extends ChannelAdapter {

    public AioClientHandler(AsynchronousSocketChannel channel, Charset charset) {
        super(channel, charset);
    }

    @Override
    public void channelActive(ChannelHandler ctx) {
        try {
            //通知客户端连接建立成功
            System.out.println("客户端连接成功:" + ctx.channel().getRemoteAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void channelInactive(ChannelHandler ctx) {
    }

    @Override
    public void channelRead(ChannelHandler ctx, Object msg) {
        System.out.println("服务端收到：" + new Date() + " " + msg + "\r\n");
        ctx.writeAndFlush("\r\n客户端信息处理成功！\r\n");
    }

}
