package com.example.springboot_mysql_demo.service;

import com.example.springboot_mysql_demo.pojo.User;
import com.example.springboot_mysql_demo.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    User add(UserDto user);

    /**
     * 查询用户对应数据
     * @param userId 用户ID
     * @return
     */
    User getUser(Integer userId);

    /**
     * 修改用户数据
     * @param user
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除指定用户数据
     *
     * @param userId
     */
    void delete(Integer userId);
}
