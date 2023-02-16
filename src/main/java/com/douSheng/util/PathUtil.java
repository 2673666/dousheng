package com.douSheng.util;

import org.springframework.boot.system.ApplicationHome;

/**
 * @author zhiyuan
 * @date 2023/2/13 -16:15
 */
 public class PathUtil {

//   返回文件的路径
    public  String getPath(){

        ApplicationHome home = new ApplicationHome(this.getClass());
        String absolutePath = home.getDir().getParentFile().getParentFile().getAbsolutePath();
        return absolutePath+"\\src\\main\\resources\\static\\";

    }
}
