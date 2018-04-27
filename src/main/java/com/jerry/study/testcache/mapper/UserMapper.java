package com.jerry.study.testcache.mapper;

import com.jerry.study.testcache.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> listUsers();

    public User getUserByNameAndPassword(User user);
}
