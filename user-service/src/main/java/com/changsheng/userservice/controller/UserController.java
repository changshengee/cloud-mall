package com.changsheng.userservice.controller;

import com.changsheng.common.common.CommonResult;
import com.changsheng.userservice.entity.User;
import com.changsheng.userservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户(User)表控制层
 *
 * @author makejava
 * @since 2020-09-09 17:50:04
 */
@RestController
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 用户
     *
     * @param id 用户主键
     * @return 用户
     */
    @GetMapping("user/{id}")
    public CommonResult<User> selectOne(@PathVariable String id) {
        return CommonResult.success(this.userService.queryById(id));
    }

}