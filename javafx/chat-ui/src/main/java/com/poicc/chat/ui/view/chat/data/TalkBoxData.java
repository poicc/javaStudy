package com.poicc.chat.ui.view.chat.data;

import java.util.Date;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-24 01:01
 **/
public class TalkBoxData {
    private String talkId;
    private Integer talkType;
    private String talkName;
    private String talkHead;
    private String talkSketch;
    private Date talkDate;

    public TalkBoxData(String talkId, Integer talkType, String talkName, String talkHead) {
        this.talkId = talkId;
        this.talkType = talkType;
        this.talkName = talkName;
        this.talkHead = talkHead;
    }
}
