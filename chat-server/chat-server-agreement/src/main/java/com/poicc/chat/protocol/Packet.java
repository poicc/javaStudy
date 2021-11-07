package com.poicc.chat.protocol;

import com.poicc.chat.protocol.friend.AddFriendRequest;
import com.poicc.chat.protocol.friend.AddFriendResponse;
import com.poicc.chat.protocol.friend.SearchFriendRequest;
import com.poicc.chat.protocol.friend.SearchFriendResponse;
import com.poicc.chat.protocol.login.LoginRequest;
import com.poicc.chat.protocol.login.LoginResponse;
import com.poicc.chat.protocol.login.ReconnectRequest;
import com.poicc.chat.protocol.msg.MsgGroupRequest;
import com.poicc.chat.protocol.msg.MsgGroupResponse;
import com.poicc.chat.protocol.msg.MsgRequest;
import com.poicc.chat.protocol.msg.MsgResponse;
import com.poicc.chat.protocol.talk.DelTalkRequest;
import com.poicc.chat.protocol.talk.TalkNoticeRequest;
import com.poicc.chat.protocol.talk.TalkNoticeResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 数据包
 * @author: crq
 * @create: 2021-11-07 00:08
 **/
public abstract  class Packet {
    private final static Map<Byte, Class<? extends Packet>> PACK_TYPE = new ConcurrentHashMap<>();

    static {
        PACK_TYPE.put(Command.LoginRequest, LoginRequest.class);
        PACK_TYPE.put(Command.LoginResponse, LoginResponse.class);
        PACK_TYPE.put(Command.MsgRequest, MsgRequest.class);
        PACK_TYPE.put(Command.MsgResponse, MsgResponse.class);
        PACK_TYPE.put(Command.TalkNoticeRequest, TalkNoticeRequest.class);
        PACK_TYPE.put(Command.TalkNoticeResponse, TalkNoticeResponse.class);
        PACK_TYPE.put(Command.SearchFriendRequest, SearchFriendRequest.class);
        PACK_TYPE.put(Command.SearchFriendResponse, SearchFriendResponse.class);
        PACK_TYPE.put(Command.AddFriendRequest, AddFriendRequest.class);
        PACK_TYPE.put(Command.AddFriendResponse, AddFriendResponse.class);
        PACK_TYPE.put(Command.DelTalkRequest, DelTalkRequest.class);
        PACK_TYPE.put(Command.MsgGroupRequest, MsgGroupRequest.class);
        PACK_TYPE.put(Command.MsgGroupResponse, MsgGroupResponse.class);
        PACK_TYPE.put(Command.ReconnectRequest, ReconnectRequest.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return PACK_TYPE.get(command);
    }

    /**
     * 获取协议指令
     *
     * @return 返回指令值
     */
    public abstract Byte getCommand();
}
