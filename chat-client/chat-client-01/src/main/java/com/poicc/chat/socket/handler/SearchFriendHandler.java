package com.poicc.chat.socket.handler;

import com.poicc.chat.application.UIService;
import com.poicc.chat.protocol.friend.SearchFriendResponse;
import com.poicc.chat.protocol.friend.dto.UserDto;
import com.poicc.chat.ui.view.chat.IChatMethod;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;

import java.util.List;

/**
 * @author mqxu
 */
public class SearchFriendHandler extends SimpleChannelInboundHandler<SearchFriendResponse> {

    private final UIService uiService;

    public SearchFriendHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, SearchFriendResponse msg) throws Exception {
        List<UserDto> list = msg.getList();
        if (null == list || list.isEmpty()) {
            return;
        }
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            for (UserDto user : list) {
                chat.addNewFriend(user.getUserId(), user.getUserNickName(), user.getUserHead(), user.getStatus());
            }
        });
    }

}
