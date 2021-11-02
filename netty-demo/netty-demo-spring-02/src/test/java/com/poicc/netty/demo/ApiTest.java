package com.poicc.netty.demo;

import com.googlecode.protobuf.format.JsonFormat;
import com.poicc.netty.demo.domain.MsgBody;

/**
 * @description: ApiTest
 * @author: crq
 * @create: 2021-11-02 23:53
 **/
public class ApiTest {
    public static void main(String[] args) throws JsonFormat.ParseException {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId("abD01223");
        msg.setMsgInfo("hello world");
        MsgBody msgBody = msg.build();

        //protobuf转Json 需要引入protobuf-java-format
        String msgBodyStr = JsonFormat.printToString(msgBody);
        System.out.println(msgBodyStr);

        //json转protobuf 需要引入protobuf-java-format
        JsonFormat.merge("{\"channelId\": \"HBdhi993\",\"msgInfo\": \"hi 学习之路\"}", msg);
        msgBody = msg.build();
        System.out.println(msgBody.getChannelId());
        System.out.println(msgBody.getMsgInfo());
    }
}
