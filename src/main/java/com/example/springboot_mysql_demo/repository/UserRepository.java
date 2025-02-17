package com.example.springboot_mysql_demo.repository;

import com.example.springboot_mysql_demo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //spring Bean
public interface UserRepository extends CrudRepository<User,Integer> {
}
