package com.poicc.netty.demo.client;

import com.poicc.netty.demo.codec.ObjDecoder;
import com.poicc.netty.demo.codec.ObjEncoder;
import com.poicc.netty.demo.domain.FileTransferProtocol;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @description: MyChannelInitializer
 * @author: crq
 * @create: 2021-11-03 21:36
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(FileTransferProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(FileTransferProtocol.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyClientHandler());
    }
}
