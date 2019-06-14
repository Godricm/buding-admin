package org.buding.dao;

import org.buding.dto.BaseUser;

public interface BaseUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}