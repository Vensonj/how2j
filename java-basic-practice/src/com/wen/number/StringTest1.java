package com.wen.number;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 05 周二 16:03
 * @description: 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 * <p>
 * 在比较字符串章节，有一个同样的练习
 * 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 * 使用HashSet来解决这个问题
 */
public class StringTest1 {
    public static void main(String[] args) {
        String[] str = new String[100];
        for (int i = 0; i < str.length; i++) {
            str[i] = StringTest.randomStringOfLength(2);
        }
        System.out.println(Arrays.toString(str));
        int count = 0;
        StringBuilder stringBuilders = new StringBuilder();
        for (int i = 0; i < str.length - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !stringBuilders.toString().contains(str[i])) {
                    flag = true;
                    stringBuilders.append(str[i]).append("   ");
                }
            }
            if (flag)
                count++;
        }
        if (count > 0) {
            System.out.println("总共有" + count + "种字符串重复");
            System.out.println("分别是:" + stringBuilders.toString());
        } else {
            System.out.println("没有字符串重复");
        }

        //HashSet
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(str));
        System.out.println(hashSet.size());
    }
}
