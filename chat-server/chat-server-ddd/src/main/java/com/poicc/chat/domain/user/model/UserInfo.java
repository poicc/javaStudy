package com.poicc.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 *
 * @author mqxu
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfo {

    private String userId;
    private String userNickName;
    private String userHead;

}
