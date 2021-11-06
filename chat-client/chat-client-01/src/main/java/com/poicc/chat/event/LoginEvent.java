package com.poicc.chat.event;

import com.poicc.chat.ui.view.login.ILoginEvent;

/**
 * @description: 登录事件
 * @author: crq
 * @create: 2021-11-07 00:34
 **/
public class LoginEvent implements ILoginEvent {

    @Override
    public void doLoginCheck(String userId, String userPassword) {}
}
