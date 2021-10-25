package com.poicc.chat.ui.view.face;

/**
 * @description: 定义表情框隐藏事件
 * @author: crq
 * @create: 2021-10-25 19:22
 **/
public class FaceEventDefine {
    private  FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;
        hideFace();
    }

    private void hideFace() {
        faceInit.root().setOnMouseExited(event -> faceInit.hide());
    }
}
