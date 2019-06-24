package org.buding.service;

import org.buding.common.CommonResult;
import org.buding.dto.BaseUser;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: STO
 * \* Date: 2019/6/24
 * \* Time: 13:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface BaseUserService {

    /**
     * 新增
     */
    int insert(BaseUser user);

    /**
     * 删除
     */
    int delete(String id);

    /**
     * 更新
     */
    int update(BaseUser user);

    /**
     * 根據主鍵 id 查詢
     */
    BaseUser findById(String id);

    /**
     * 根据用户名获取
     * @param loginName
     * @return
     */
    BaseUser findByName(String loginName);

    /**
     * 分页查询
     */
    List<BaseUser> pageList(int offset, int pagesize);

    /**
     * 登录
     * @param 登录名
     * @param 密码
     * @return 登录结果
     */
    boolean login(String loginName,String password);

    /**
     * 更新
     * @param id 用户id
     * @param user 用户
     * @return
     */
    int update(String id,BaseUser user);

}
