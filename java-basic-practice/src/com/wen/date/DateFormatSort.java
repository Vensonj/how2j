package com.wen.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 11 14:28 星期一
 * @description: 准备一个长度是9的日期数组
 * 使用1970年-2000年之间的随机日期初始化该数组
 * 按照这些日期的时间进行升序排序
 * 比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
 */
public class DateFormatSort {
    public static void main(String[] args) throws ParseException {
        Date[] dates = new Date[9];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstDate = new Date(0);
        Date LastDate = new Date(100, 11, 31, 23, 59, 59);
        for (int i = 0; i < dates.length; i++) {
            dates[i] = new Date((long) (Math.random() * (LastDate.getTime() - firstDate.getTime())));
        }
      /*  for (int j = 1; j < dates.length; j++) {
            if (dates[j].getHours() < dates[0].getHours()) {
                Date temp = dates[j];
                dates[j] = dates[0];
                dates[0] = temp;

            } else if (dates[j].getHours() == dates[0].getHours() && dates[j].getMinutes() < dates[0].getMinutes()) {
                Date temp = dates[j];
                dates[j] = dates[0];
                dates[0] = temp;

            } else if (dates[j].getHours() == dates[0].getHours() && dates[j].getMinutes() == dates[0].getMinutes() && dates[j].getSeconds() < dates[0].getSeconds()) {
                Date temp = dates[j];
                dates[j] = dates[0];
                dates[0] = temp;

            }
        }
        for (Date date : dates) {
            System.out.println(simpleDateFormat.format(date));
        }
        System.out.println("第一轮排序结果是："simpleDateFormat.format(date));

        for (int j = 2; j < dates.length; j++) {
            if (dates[j].getHours() < dates[1].getHours()) {
                Date temp = dates[j];
                dates[j] = dates[1];
                dates[1] = temp;

            } else if (dates[j].getHours() == dates[1].getHours() && dates[j].getMinutes() < dates[1].getMinutes()) {
                Date temp = dates[j];
                dates[j] = dates[1];
                dates[1] = temp;

            } else if (dates[j].getHours() == dates[1].getHours() && dates[j].getMinutes() == dates[1].getMinutes() && dates[j].getSeconds() < dates[1].getSeconds()) {
                Date temp = dates[j];
                dates[j] = dates[1];
                dates[1] = temp;

            }
        }
        for (Date date : dates) {
            System.out.println(simpleDateFormat.format(date));
        }
        System.out.println("第二轮排序结果是："simpleDateFormat.format(date));
        */
        for (int i = 0; i < dates.length - 1; i++) {
            for (int j = i + 1; j < dates.length; j++) {
                if (dates[j].getHours() < dates[i].getHours()) {
                    Date temp = dates[j];
                    dates[j] = dates[i];
                    dates[i] = temp;

                } else if (dates[j].getHours() == dates[i].getHours() && dates[j].getMinutes() < dates[i].getMinutes()) {
                    Date temp = dates[j];
                    dates[j] = dates[i];
                    dates[i] = temp;

                } else if (dates[j].getHours() == dates[i].getHours() && dates[j].getMinutes() == dates[i].getMinutes() && dates[j].getSeconds() < dates[i].getSeconds()) {
                    Date temp = dates[j];
                    dates[j] = dates[i];
                    dates[i] = temp;

                }
            }
        }
        for (Date date : dates) {
            System.out.println(simpleDateFormat.format(date));
        }
    }
}
