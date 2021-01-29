package com.wen.number;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 10:56
 * @description: 创建一个长度是8的字符串数组
 * 使用8个长度是5的随机字符串初始化这个数组
 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 * 注1： 不能使用Arrays.sort() 要自己写
 * 注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
 */
public class SortString {
    public static void main(String[] args) {
        String[] strings = new String[8]; //[null, null, null, null, null, null, null, null]
        for (int i = 0; i < strings.length; i++) {
            //        长度是5的随机字符串
            strings[i] = StringTest.randomStringOfLength(5);
        }
        System.out.println("排序前数组：" + Arrays.toString(strings));

      /*  for (int i = 1; i < strings.length; i++) {

            //如果有数字
            if (Character.isDigit(strings[i].charAt(0)) || Character.isDigit(strings[0].charAt(0)) && strings[i].charAt(0) < strings[0].charAt(0)) {
                String temp = strings[i];
                strings[i] = strings[0];
                strings[0] = temp;
            }
            //无视大小写
            if (Character.isLetter(strings[i].charAt(0)) && Character.isLetter(strings[0].charAt(0)) && Character.toUpperCase(strings[i].charAt(0)) < Character.toUpperCase(strings[0].charAt(0))) {
                String temp = strings[i];
                strings[i] = strings[0];
                strings[0] = temp;
            }
        }
        System.out.println("第1轮排序后数组：" + Arrays.toString(strings));

        for (int i = 2; i < strings.length; i++) {

            //如果有数字
            if (Character.isDigit(strings[i].charAt(0)) || Character.isDigit(strings[1].charAt(0)) && strings[i].charAt(0) < strings[1].charAt(0)) {
                String temp = strings[i];
                strings[i] = strings[1];
                strings[1] = temp;
            }
            //无视大小写
            if (Character.isLetter(strings[i].charAt(0)) && Character.isLetter(strings[1].charAt(0)) && Character.toUpperCase(strings[i].charAt(0)) < Character.toUpperCase(strings[1].charAt(0))) {
                String temp = strings[i];
                strings[i] = strings[1];
                strings[1] = temp;
            }
        }
        System.out.println("第2轮排序后数组：" + Arrays.toString(strings));*/
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                //如果有数字
                if (Character.isDigit(strings[j].charAt(0)) || Character.isDigit(strings[i].charAt(0))) {
                    if (strings[j].charAt(0) < strings[i].charAt(0)) {
                        String temp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = temp;
                    }
                }
                //无视大小写
                if (Character.isLetter(strings[j].charAt(0)) && Character.isLetter(strings[i].charAt(0)) && Character.toUpperCase(strings[j].charAt(0)) < Character.toUpperCase(strings[i].charAt(0))) {
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
            }
        }
        System.out.println("排序后的数组:" + Arrays.toString(strings));
    }
}
