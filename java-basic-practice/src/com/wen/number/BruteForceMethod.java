package com.wen.number;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 05 周二 14:39
 * @description: 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
 * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
 * 要求： 分别使用多层for循环 和 递归解决上述问题
 */
public class BruteForceMethod {
    public static void main(String[] args) {

        String string = StringTest.randomStringOfLength(3);
        System.out.println(string);

        String[] str = new String[62];

        int i = 0;
        for (char c = '0'; c <= '9'; c++) {
            str[i++] = String.valueOf(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            str[i++] = String.valueOf(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            str[i++] = String.valueOf(c);
        }

        StringBuilder s = new StringBuilder();

//        多层for循环
        for (int k = 0; k < string.length(); k++) {
            for (String value : str) {
                if (value.equals(String.valueOf(string.charAt(k)))) {
                    s.append(value);
                }
            }
        }
        System.out.println(s);
        System.out.println(s.toString().equals(string));

//        递归
   /*     brute(str, string, s, 3);

    }

    public static void brute(String[] str, String string, StringBuilder s, int n) {
        while (n > 0) {
            for (String value : str) {
                if (value.equals(String.valueOf(string.charAt(n - 1)))) {
                    s.append(value);
                    n -= 1;
                    brute(str, string, s, n);
                }
            }
        }
        System.out.println(s.reverse().toString().equals(string));
        System.out.println(s.reverse().toString());
        System.out.println(s);
    }*/
    }
}
