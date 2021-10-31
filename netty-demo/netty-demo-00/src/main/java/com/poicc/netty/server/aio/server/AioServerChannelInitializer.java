package com.poicc.netty.server.aio.server;


import com.poicc.netty.server.aio.ChannelInitializer;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * @description: 服务端初始化
 * @author: crq
 * @create: 2021-10-30 23:41
 **/
public class AioServerChannelInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(AsynchronousSocketChannel channel) throws Exception {
        channel.read(ByteBuffer.allocate(1024), 10, TimeUnit.SECONDS, null, new AioServerHandler(channel, StandardCharsets.UTF_8));
    }
}
