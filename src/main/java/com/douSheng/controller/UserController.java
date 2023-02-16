package com.douSheng.controller;

import com.douSheng.pojo.RegisterResult;
import com.douSheng.pojo.User;
import com.douSheng.pojo.UserInfoResult;
import com.douSheng.service.UserService;
import com.douSheng.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiyuan
 * @date 2023/2/9 -9:30
 */
@RequestMapping("/douyin/user")
@RestController
public class UserController {
    @Autowired(required = false)
    private UserService userService;

//    登录接口
    @RequestMapping("/login/")
    public RegisterResult login(
            @RequestParam(name = "username") String name,
            @RequestParam(name = "password") String password){
        RegisterResult rr = new RegisterResult();
        int suc = userService.login(name, password);//0 表示登录成功 1 表示失败
        if(suc == 0){
            rr.setStatusCode(suc);
            rr.setStatusMsg("登录成功");
            rr.setUserid(userService.selectIdByName(name));
            String token = TokenUtils.createToken(new User(name, password));
            rr.setToken(token);
            return rr;
        }
        rr.setStatusCode(1);
        rr.setStatusMsg("账号或密码错误");

        return rr;
    }


//  注册接口
    @RequestMapping("/register/")
    public RegisterResult register(
            @RequestParam(name="username") String name,
            @RequestParam(name="password") String password
    ){
//       返回 1 表示成功，返回 0 表示失败
        int result = userService.register(name, password);
        RegisterResult rr = new RegisterResult();
        if(result==1){
            rr.setUserid(userService.selectIdByName(name));
            rr.setStatusCode(200);
            rr.setStatusMsg("注册成功");
            String token = TokenUtils.createToken(new User(name, password));
            rr.setToken(token);
            return rr;
        }
        return rr;
    }

//    用户xinx
    @RequestMapping("/")
    public UserInfoResult getUserInfo(
        @RequestParam("user_id") String userId,
        @RequestParam("token") String token
    ){
        long id = Integer.parseInt(userId);
        User user = userService.selectById(id);
        UserInfoResult result = new UserInfoResult();
        result.setUser(user);
        result.setStatusCode(0);
        result.setStatusMsg("查询用户个人信息成功");

        return result;

    }
}
