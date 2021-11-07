package com.poicc.chat.protocol.friend;


import com.poicc.chat.protocol.Command;
import com.poicc.chat.protocol.Packet;
import com.poicc.chat.protocol.friend.dto.UserDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 搜索好友应答
 *
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
