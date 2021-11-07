package com.poicc.chat.protocol.friend;

import com.poicc.chat.protocol.Command;
import com.poicc.chat.protocol.Packet;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 搜索好友请求
 *
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class SearchFriendRequest extends Packet {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 搜索字段
     */
    private String searchKey;

    public SearchFriendRequest() {
    }

    public SearchFriendRequest(String userId, String searchKey) {
        this.userId = userId;
        this.searchKey = searchKey;
    }


    @Override
    public Byte getCommand() {
        return Command.SearchFriendRequest;
    }

}
