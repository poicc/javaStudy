package com.poicc.chat.ui.view.face;

import com.poicc.chat.ui.view.UIObject;
import com.poicc.chat.ui.view.chat.ChatInit;
import com.poicc.chat.ui.view.chat.IChatEvent;
import com.poicc.chat.ui.view.chat.IChatMethod;

/**
 * @description: 设置表情框位置
 * @author: crq
 * @create: 2021-10-25 19:27
 **/
public class FaceController extends FaceInit implements IFaceMethod {

    private FaceView faceView;


    public FaceController(UIObject obj, ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod) {
        super(obj);
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;
    }


    @Override
    public void initView() {
        faceView = new FaceView(this);
    }

    @Override
    public void initEventDefine() {
        new FaceEventDefine(this);
    }

    @Override
    public void doShowFace(Double x, Double y) {
        // 设置位置 X
        setX(x + 230 * (1 - 0.618));
        // 设置位置 Y
        setY(y - 160);
        // 展示窗口
        show();
    }
}
