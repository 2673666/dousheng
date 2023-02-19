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

    /**
     *
     * @param user 传入一个用户名和密码不为空的 User 类，生成相对应的 token 并存在 tokenMap 中（鉴权使用）
     * @return 一个字符串 userName：password
     */
    public static String createToken(User user) {
        String token = user.getPassword()+":"+user.getName();
        tokenMap.put(token,user);
        return token;
    }

    /**
     *
     * @param token 传入一个 token 类型字符串
     * @return 传入的 token 是否存在于 当前的 tokenMap 中
     */
    public static boolean verify(String token){
        return tokenMap.containsKey(token);
    }
    }
