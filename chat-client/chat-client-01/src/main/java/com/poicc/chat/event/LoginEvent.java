package com.poicc.chat.event;

import com.poicc.chat.infrastructure.util.BeanUtil;
import com.poicc.chat.infrastructure.util.CacheUtil;
import com.poicc.chat.protocol.login.LoginRequest;
import com.poicc.chat.ui.view.login.ILoginEvent;
import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;


/**
 * 事件实现；登陆窗口
 *
 * @author mqxu
 */
@Slf4j
public class LoginEvent implements ILoginEvent {

    @Override
    public void doLoginCheck(String userId, String userPassword) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new LoginRequest(userId, userPassword));
        CacheUtil.userId = userId;
    }

}
