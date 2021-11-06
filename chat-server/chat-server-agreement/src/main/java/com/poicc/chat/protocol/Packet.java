package com.poicc.chat.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 数据包
 * @author: crq
 * @create: 2021-11-07 00:08
 **/
public abstract  class Packet {
    private final static Map<Byte, Class<? extends Packet>> packetType = new ConcurrentHashMap<>();

    static {
//        packetType.put(Command.Demo01, Demo01.class);
//        packetType.put(Command.Demo02, Demo02.class);
//        packetType.put(Command.Demo03, Demo03.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return packetType.get(command);
    }

    /**
     * 获取协议指令
     *
     * @return 返回指令值
     */
    public abstract Byte getCommand();
}
