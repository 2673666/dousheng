package com.douSheng.service;

import com.douSheng.pojo.User;

/**
 * @author zhiyuan
 * @date 2023/2/11 -10:02
 */
public interface UserService {
//    根据 用户名 和 密码 注册用户
    int register(String username,String password);
//    根据用户名查id
    long selectIdByName(String name);

    int login (String name, String password);

    User selectById(long id);

}
