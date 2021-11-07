package com.poicc.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 群组
 *
 * @author mqxu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Groups {

    private Long id;
    private String groupId;
    private String groupName;
    private String groupHead;
    private Date createTime;
    private Date updateTime;

}
