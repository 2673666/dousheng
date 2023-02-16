package com.douSheng.service.impl;

import com.douSheng.mapper.UserMapper;
import com.douSheng.pojo.User;
import com.douSheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhiyuan
 * @date 2023/2/11 -10:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public int register(String username, String password) {
//        封装一个 User
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        return userMapper.insertSelective(user);
    }

    @Override
    public long selectIdByName(String name) {

        return userMapper.selectIdByName(name);
    }

    @Override
    public int login(String name, String password) {
        int res = 9999;// 0 表示成功，非 0 表示失败
        int tmp = userMapper.login(name,password);
        if(tmp != 0)
            res = 0;
        return res;
    }

    @Override
    public User selectById(long id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
