package com.douSheng.util;

import com.douSheng.pojo.Video;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -10:48
 */
public abstract class ParseUrlUtil {


    static public List<Video> parseUrl(List<Video> videos) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
//        List<Object> videoList = new ArrayList<>();
        for(Video v : videos){
//             url 补全
            v.setCoverUrl("http://"+ip+":8081/"+v.getCoverUrl());
            v.setPlayUrl("http://"+ip+":8081/"+v.getPlayUrl());
//            Object o = JSON.toJSON(v);
//            JSONObject j = (JSONObject) JSONObject.toJSON(v);

//            videoList.add(j);
        }

        return videos;

//        list 转 json 字符串
//        return JSON.toJSON(videoList).toString();
    }
}