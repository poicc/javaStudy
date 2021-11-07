package com.poicc.chat.socket.handler;

import com.poicc.chat.application.UIService;
import com.poicc.chat.protocol.msg.MsgResponse;
import com.poicc.chat.ui.view.chat.IChatMethod;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;


/**
 * @author mqxu
 */
public class MsgHandler extends SimpleChannelInboundHandler<MsgResponse> {

    private final UIService uiService;

    public MsgHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgResponse msg) throws Exception {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            chat.addTalkMsgUserLeft(msg.getFriendId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate(), true, false, true);
        });
    }

}

