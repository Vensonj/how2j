package com.wen.number;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 16:03
 * @description: 通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
 * 转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
 */
public class CharacterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串内容:");
        String s = scanner.nextLine();
        //方式1:
        /*char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c) | Character.isDigit(c)) {
                System.out.print(c);
            }
        }*/

        //方式2:
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
            if (Character.isUpperCase(chars[i]) | Character.isDigit(chars[i])) {
                System.out.print(chars[i]);
            }
        }
    }
}
