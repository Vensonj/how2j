package com.wen.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 15:53 星期二
 * @description: 找出下个月的倒数第3天是哪天
 */
public class CalendarDemo {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
       /* //采用单例模式获取日历对象Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //通过日历对象得到日期对象
        Date date = calendar.getTime();
        System.out.println(date);
        Date date1 = new Date(0);
        System.out.println(date1);
        calendar.setTime(date1);

        System.out.println(date1);*/


        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" + format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" + format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" + format(c.getTime()));

        // 下个月的倒数第3天
        c.setTime(now);
        c.add(Calendar.MONTH, 2);
        c.set(Calendar.DATE, -3);
        System.out.println("下个月的倒数第3天:\t" + format(c.getTime()));

    }


    private static String format(Date time) {
        return sdf.format(time);
    }
}
