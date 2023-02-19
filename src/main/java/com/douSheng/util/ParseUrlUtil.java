package com.douSheng.util;

import com.douSheng.pojo.Video;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -10:48
 */
public abstract class ParseUrlUtil {
    /**
     *
     * @param videos 待修改视频地址和封面地址的 视频集合
     * @return 返回添加了 url 前缀的 视频集合
     * @throws UnknownHostException
     */
    static public List<Video> parseUrl(List<Video> videos) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        int serverPort = request.getServerPort();
        for(Video v : videos){
//             url 补全  此处
            v.setCoverUrl("http://"+ip+":"+serverPort+"/"+v.getCoverUrl());
            v.setPlayUrl("http://"+ip+":"+serverPort+"/"+v.getPlayUrl());
        }

        return videos;
    }
}