package com.douSheng.util;

import com.douSheng.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhiyuan
 * @date 2023/2/11 -15:05
 */
public abstract class TokenUtils {
    private static Map<String,User> tokenMap = new HashMap<>();

//  token 的生成
    public static String createToken(User user) {
        String token = user.getPassword()+":"+user.getName();
        tokenMap.put(token,user);
        return token;
    }
//  token 的校验
    public static boolean verify(String token){
        return tokenMap.containsKey(token);
    }
    }
