package com.poicc.chat.codec;

import com.poicc.chat.protocol.Packet;
import com.poicc.chat.util.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @description: 编码器
 * @author: crq
 * @create: 2021-11-07 00:09
 **/
public class ObjEncoder extends MessageToByteEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet in, ByteBuf out) {byte[] data = SerializationUtil.serialize(in);
        out.writeInt(data.length + 1);
        // 添加指令
        out.writeByte(in.getCommand());
        out.writeBytes(data);
    }
}
