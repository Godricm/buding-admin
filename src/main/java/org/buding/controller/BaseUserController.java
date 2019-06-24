package org.buding.controller;

import org.buding.common.CommonResult;
import org.buding.dto.BaseUser;
import org.buding.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: STO
 * \* Date: 2019/6/24
 * \* Time: 14:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/user")
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody BaseUser user, BindingResult result){
       int i= baseUserService.insert(user);

        if(i<0){
            return CommonResult.failed();
        }
        return CommonResult.success(user);
    }

    /**
     * 登录
     * @param loginName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public CommonResult login(@RequestBody BaseUser user, BindingResult result){

        return baseUserService.login(user.getLoginName(),user.getPassword())?CommonResult.success():CommonResult.failed();
    }

    /**
     *
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value="/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable String id,@RequestBody BaseUser user){
        return baseUserService.update(id,user)>0?CommonResult.success():CommonResult.failed();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public CommonResult delete(@PathVariable String id){
        return baseUserService.delete(id)>0?CommonResult.success():CommonResult.failed();
    }
}
