package com.poicc.chat.protocol.friend.dto;

import lombok.Data;

/**
 * UserDto
 *
 * @author mqxu
 */
@Data
public class UserDto {

    private String userId;
    private String userNickName;
    private String userHead;
    private Integer status;

    public UserDto() {
    }

    public UserDto(String userId, String userNickName, String userHead) {
        this.userId = userId;
        this.userNickName = userNickName;
        this.userHead = userHead;
    }

}
