package com.example.springboot_mysql_demo.service;

import com.example.springboot_mysql_demo.pojo.ResponseMessage;
import com.example.springboot_mysql_demo.pojo.User;
import com.example.springboot_mysql_demo.pojo.dto.UserDto;
import com.example.springboot_mysql_demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //配置成springboot Bean
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(UserDto user) {
        // 调用数据访问类的方法
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new IllegalArgumentException("用户不存在，参数异常！");
        });

    }

    @Override
    public User edit(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
