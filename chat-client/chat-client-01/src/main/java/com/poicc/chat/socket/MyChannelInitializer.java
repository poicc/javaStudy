package com.poicc.chat.socket;

import com.poicc.chat.codec.ObjDecoder;
import com.poicc.chat.codec.ObjEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-07 00:32
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        // 对象传输处理[解码]
        channel.pipeline().addLast(new ObjDecoder());
        // 在管道中添加我们自己的接收数据实现方法
        // ...
        // 对象传输处理[编码]
        channel.pipeline().addLast(new ObjEncoder());
    }
}
