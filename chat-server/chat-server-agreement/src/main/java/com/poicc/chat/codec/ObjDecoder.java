package com.poicc.chat.codec;

import com.poicc.chat.protocol.Packet;
import com.poicc.chat.util.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-07 00:09
 **/
public class ObjDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        if (in.readableBytes() < 4) {return;}
        in.markReaderIndex();
        int dataLength = in.readInt();
        if (in.readableBytes() < dataLength) {in.resetReaderIndex();
            return;
        }
        // 读取指令
        byte command = in.readByte();
        // 指令占了一位，剔除掉
        byte[] data = new byte[dataLength - 1];
        in.readBytes(data);
        out.add(SerializationUtil.deserialize(data, Packet.get(command)));
    }

}
