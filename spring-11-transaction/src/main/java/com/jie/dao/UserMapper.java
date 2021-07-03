package com.jie.dao;

import com.jie.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> selectAll();


    //添加一个用户
    int addUser(User user);

    //根据id删除用户
    int deleteUser(@Param("id") int id);

}
