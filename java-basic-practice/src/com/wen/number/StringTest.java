package com.wen.number;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 10:27
 * @description: 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
 */
public class StringTest {
    public static void main(String[] args) {
//        char c = '9';
//        System.out.println((int) c);

//        int b = 65;
//        System.out.println((char)b);

        String str = randomStringOfLength(5);
        System.out.println(str);
    }

    public static String randomStringOfLength(int length) {
        StringBuilder temp = new StringBuilder();
        for (char c = '0'; c <= '9'; c++) {
            temp.append(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            temp.append(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            temp.append(c);
        }
        StringBuilder strBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            strBuilder.append(temp.charAt((int) (Math.random() * temp.length())));
        }
        return strBuilder.toString();
    }
}
