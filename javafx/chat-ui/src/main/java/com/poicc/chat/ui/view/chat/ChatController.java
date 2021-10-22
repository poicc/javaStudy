package com.poicc.chat.ui.view.chat;

/**
 * @description: 窗体的控制管理
 * @author: crq
 * @create: 2021-10-22 23:46
 **/
public class ChatController extends ChatInit implements IChatMethod{
    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        super.show();
    }
}
