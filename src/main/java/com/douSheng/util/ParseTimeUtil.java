package com.douSheng.util;

import java.text.ParseException;
import java.util.Date;

/**
 * @author zhiyuan
 * @date 2023/2/17 -12:32
 */
public abstract class ParseTimeUtil {

    /**
     *
     * @param s 字符串类型的时间戳
     * @return 转换成 Date 类型的时间
     * @throws ParseException
     */
    public static Date stringToDate(String s) throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time = Long.parseLong(s);
        Date date = new Date(time);
        return date;
    }
}
