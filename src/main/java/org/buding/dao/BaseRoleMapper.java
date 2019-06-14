package org.buding.dao;

import org.buding.dto.BaseRole;

public interface BaseRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseRole record);

    int insertSelective(BaseRole record);

    BaseRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseRole record);

    int updateByPrimaryKey(BaseRole record);
}