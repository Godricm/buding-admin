package org.buding.dao;

import org.buding.dto.BaseUser;
import org.buding.util.BaseMapper;

public interface BaseUserMapper extends BaseMapper<BaseUser> {
    BaseUser selectByLoginName(String loginName);
}