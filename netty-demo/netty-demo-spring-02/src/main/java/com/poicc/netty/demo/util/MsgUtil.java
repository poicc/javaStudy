package com.poicc.netty.demo.util;

import com.poicc.netty.demo.domain.MsgBody;

/**
 * @description: MsgUtil
 * @author: crq
 * @create: 2021-11-02 23:51
 **/
public class MsgUtil {
    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }
}
