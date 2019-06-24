package org.buding.service.Impl;

import com.github.pagehelper.PageHelper;
import org.buding.dao.BaseUserMapper;
import org.buding.dto.BaseUser;
import org.buding.service.BaseUserService;
import org.buding.util.MD5Util;
import org.buding.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: STO
 * \* Date: 2019/6/24
 * \* Time: 13:23
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class BaseUserServiceImpl implements BaseUserService {

    private static final String SALT  = "buding";

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public int insert(BaseUser user) {
        BaseUser baseUser=baseUserMapper.selectByLoginName(user.getLoginName());
        if(baseUser!=null){
            return -1;
        }
        user.setId(UUIDUtil.createUUID());
        user.setSalt(SALT);
        //密码加密
        user.setPassword(MD5Util.encode(user.getPassword(),SALT));
        user.setCreatedTime(new Date());
        user.setModifiedTime(new Date());
        return baseUserMapper.insert(user);
    }

    @Override
    public int delete(String id) {
        return baseUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(BaseUser user) {
        return baseUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public BaseUser findById(String id) {
        return baseUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public BaseUser findByName(String loginName) {
      return   baseUserMapper.selectByLoginName(loginName);
    }

    @Override
    public List<BaseUser> pageList(int offset, int pagesize) {
        PageHelper.startPage(offset,pagesize);
//        Weekend<BaseUser> weekend = Weekend.of(BaseUser.class);
//        WeekendCriteria<BaseUser, Object> criteria = weekend.weekendCriteria();

        return baseUserMapper.selectAll();
    }

    @Override
    public boolean login(String loginName, String password) {
        BaseUser baseUser=baseUserMapper.selectByLoginName(loginName);
        String newPassword=MD5Util.encode(password,baseUser.getSalt());
        boolean result=baseUser.getPassword().equals(newPassword);;
        return result;
    }

    @Override
    public int update(String id, BaseUser user) {
        user.setId(id);
        user.setPassword(null);
        user.setModifiedTime(new Date());
        return baseUserMapper.updateByPrimaryKeySelective(user);
    }
}
