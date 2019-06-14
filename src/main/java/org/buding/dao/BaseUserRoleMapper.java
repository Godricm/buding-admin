package org.buding.dao;

import org.buding.dto.BaseUserRole;

public interface BaseUserRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseUserRole record);

    int insertSelective(BaseUserRole record);

    BaseUserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseUserRole record);

    int updateByPrimaryKey(BaseUserRole record);
}