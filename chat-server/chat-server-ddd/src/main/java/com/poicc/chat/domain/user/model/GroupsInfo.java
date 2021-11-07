package com.poicc.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 群组信息
 *
 * @author mqxu
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupsInfo {

    private String groupId;
    private String groupName;
    private String groupHead;

}
