package com.poicc.chat.domain.inet.model;

import com.poicc.chat.infrastructure.common.PageReq;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class ChannelUserReq extends PageReq {

    private String userId;
    private String userNickName;

}
