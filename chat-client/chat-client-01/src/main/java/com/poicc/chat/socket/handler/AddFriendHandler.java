package com.poicc.chat.socket.handler;

import com.poicc.chat.application.UIService;
import com.poicc.chat.protocol.friend.AddFriendResponse;
import com.poicc.chat.socket.MyBizHandler;
import com.poicc.chat.ui.view.chat.IChatMethod;
import io.netty.channel.Channel;
import javafx.application.Platform;


/**
 * @author mqxu
 */
public class AddFriendHandler extends MyBizHandler<AddFriendResponse> {

    public AddFriendHandler(UIService uiService) {
        super(uiService);
    }

    @Override
    public void channelRead(Channel channel, AddFriendResponse msg) {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> chat.addFriendUser(true, msg.getFriendId(), msg.getFriendNickName(), msg.getFriendHead()));
    }

}
