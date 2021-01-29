package com.wen.controlflow;

import java.util.Scanner;

/**
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 * 寻找所有的水仙花数
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        int x;// 个位数
        int y;//十位数
        int z; //百位数
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要测试的数字（3位数字）：");
        int num = scanner.nextInt();*/
        for (int i = 100; i <= 999; i++) {
            x = i % 10;
            y = i / 10 % 10;
            z = i / 100;
            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.println(i);
            }
        }
        /*测试表达式是否正确
        x = num % 10;
        y = num / 10 % 10;
        z = num / 100;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/
    }
}
