package com.example.springboot_mysql_demo.controller;

import com.example.springboot_mysql_demo.pojo.ResponseMessage;
import com.example.springboot_mysql_demo.pojo.User;
import com.example.springboot_mysql_demo.pojo.dto.UserDto;
import com.example.springboot_mysql_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //允许接口方法返回对象，转换成Json文本
@RequestMapping("/user")    //localhost:8088/user/**
public class UserController {
    @Autowired
    private IUserService userService;
    // Rest
    // 增
    @PostMapping    //URL: localhost:8088/user/**   method: post
    public ResponseMessage add(@Validated @RequestBody UserDto user){
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);

    }

    // 删
    // @DeleteMapping
    @DeleteMapping("/{userId}") //URL: localhost:8088/user/1   method: get
    public ResponseMessage delete(@Validated @RequestBody Integer userId){
        userService.delete(userId);
        return ResponseMessage.success();

    }

    // 改
    // @PutMapping
    @PutMapping("/{userId}") //URL: localhost:8088/user/1   method: get
    public ResponseMessage edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);

    }

    // 查
     @GetMapping("/{userId}") //URL: localhost:8088/user/1   method: get
     public ResponseMessage get(@Validated @RequestBody Integer userId){
         User user = userService.getUser(userId);
         return ResponseMessage.success(user);

     }






}
