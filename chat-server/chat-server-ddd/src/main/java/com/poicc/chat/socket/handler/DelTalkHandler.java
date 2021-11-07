package com.poicc.chat.socket.handler;

import com.poicc.chat.application.UserService;
import com.poicc.chat.protocol.talk.DelTalkRequest;
import com.poicc.chat.socket.MyBizHandler;
import io.netty.channel.Channel;


/**
 * @author mqxu
 */
public class DelTalkHandler extends MyBizHandler<DelTalkRequest> {

    public DelTalkHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, DelTalkRequest msg) {
        userService.deleteUserTalk(msg.getUserId(), msg.getTalkId());
    }
}
