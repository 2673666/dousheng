package com.douSheng.mapper;

import com.douSheng.pojo.User;

public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
//  根据 用户名 查询 id
    long selectIdByName(String name);
//    登录,返回 id
    int login(String name,String password);

}