package org.buding.dao;

import org.buding.dto.BasePermission;

public interface BasePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(BasePermission record);

    int insertSelective(BasePermission record);

    BasePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BasePermission record);

    int updateByPrimaryKey(BasePermission record);
}