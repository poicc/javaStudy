package com.poicc.chat.infrastructure.dao;

import com.poicc.chat.infrastructure.po.ChatRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IChatRecordDao {

    void appendChatRecord(ChatRecord req);

    List<ChatRecord> queryUserChatRecordList(String talkId, String userId);

    List<ChatRecord> queryGroupsChatRecordList(String talkId, String userId);

}
