package com.poicc.chat.infrastructure.po;

import lombok.Data;

import java.util.Date;

/**
 * 用户好友
 *
 * @author mqxu
 */

@Data
public class UserFriend {

    private Long id;
    private String userId;
    private String userFriendId;
    private Date createTime;
    private Date updateTime;

    public UserFriend() {
    }

    public UserFriend(String userId, String userFriendId) {
        this.userId = userId;
        this.userFriendId = userFriendId;
    }

}
