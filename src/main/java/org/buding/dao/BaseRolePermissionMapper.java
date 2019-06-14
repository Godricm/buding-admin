package org.buding.dao;

import org.buding.dto.BaseRolePermission;

public interface BaseRolePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseRolePermission record);

    int insertSelective(BaseRolePermission record);

    BaseRolePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseRolePermission record);

    int updateByPrimaryKey(BaseRolePermission record);
}