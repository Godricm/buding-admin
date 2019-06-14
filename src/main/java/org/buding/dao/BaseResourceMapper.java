package org.buding.dao;

import org.buding.dto.BaseResource;

public interface BaseResourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseResource record);

    int insertSelective(BaseResource record);

    BaseResource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseResource record);

    int updateByPrimaryKey(BaseResource record);
}