package com.jie.dao;

import com.jie.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImlT extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectAll() {
        return getSqlSession().getMapper(UserMapper.class).selectAll();
    }
}
