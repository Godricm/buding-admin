package org.buding.dao;

import org.buding.dto.BaseOrg;

public interface BaseOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseOrg record);

    int insertSelective(BaseOrg record);

    BaseOrg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseOrg record);

    int updateByPrimaryKey(BaseOrg record);
}