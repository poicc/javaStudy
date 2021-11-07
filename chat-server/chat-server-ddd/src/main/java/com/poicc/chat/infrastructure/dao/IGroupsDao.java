package com.poicc.chat.infrastructure.dao;

import com.poicc.chat.infrastructure.po.Groups;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}
