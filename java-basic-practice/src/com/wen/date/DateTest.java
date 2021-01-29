package com.wen.date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
       /* Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(date.toInstant());*/

        /*Date date = new Date(0);
        System.out.println(date);*/
/*
借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
 */
        Date date1 = new Date(95, 1, 1);
        System.out.println(date1);//Wed Feb 01 00:00:00 CST 1995

        Date date2 = new Date(94, 12, 31, 23, 59, 59);
        System.out.println(date2);
    }
}
