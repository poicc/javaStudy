package com.poicc.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author mqxu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TalkBox {

    private Long id;
    private String userId;
    private String talkId;
    private Integer talkType;
    private Date createTime;
    private Date updateTime;

}
