package com.poicc.netty.demo.util;

import com.poicc.netty.demo.domain.MsgInfo;

/**
 * @description: MsgUtil
 * @author: crq
 * @create: 2021-11-03 00:03
 **/
public class MsgUtil {
    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }
}
