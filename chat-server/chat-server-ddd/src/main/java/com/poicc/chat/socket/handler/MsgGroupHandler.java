package com.poicc.chat.socket.handler;

import com.poicc.chat.application.UserService;
import com.poicc.chat.domain.user.model.ChatRecordInfo;
import com.poicc.chat.domain.user.model.UserInfo;
import com.poicc.chat.infrastructure.common.Constants;
import com.poicc.chat.infrastructure.common.SocketChannelUtil;
import com.poicc.chat.protocol.msg.MsgGroupRequest;
import com.poicc.chat.protocol.msg.MsgGroupResponse;
import com.poicc.chat.socket.MyBizHandler;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;


/**
 * 群组消息发送
 *
 * @author mqxu
 */
public class MsgGroupHandler extends MyBizHandler<MsgGroupRequest> {

    public MsgGroupHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, MsgGroupRequest msg) {
        // 获取群组通信管道
        ChannelGroup channelGroup = SocketChannelUtil.getChannelGroup(msg.getTalkId());
        if (null == channelGroup) {
            SocketChannelUtil.addChannelGroup(msg.getTalkId(), channel);
            channelGroup = SocketChannelUtil.getChannelGroup(msg.getTalkId());
        }
        // 异步写库
        userService.asyncAppendChatRecord(new ChatRecordInfo(msg.getUserId(), msg.getTalkId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate(), Constants.TalkType.Group.getCode()));
        // 群发消息
        UserInfo userInfo = userService.queryUserInfo(msg.getUserId());
        MsgGroupResponse msgGroupResponse = new MsgGroupResponse();
        msgGroupResponse.setTalkId(msg.getTalkId());
        msgGroupResponse.setUserId(msg.getUserId());
        msgGroupResponse.setUserNickName(userInfo.getUserNickName());
        msgGroupResponse.setUserHead(userInfo.getUserHead());
        msgGroupResponse.setMsg(msg.getMsgText());
        msgGroupResponse.setMsgType(msg.getMsgType());
        msgGroupResponse.setMsgDate(msg.getMsgDate());
        channelGroup.writeAndFlush(msgGroupResponse);
    }

}
