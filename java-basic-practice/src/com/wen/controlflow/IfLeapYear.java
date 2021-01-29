package com.wen.controlflow;

import java.util.Scanner;

/**
 * @author Administrator
 * 判断某一年是否为闰年
 * 通过Scanner 输入一个年份，然后判断该年是否是闰年
 * <p>
 * 闰年判断标准(满足任何一个)
 * 1. 如果能够被4整除，但是不能被100整除
 * 2. 能够被400整除
 */
public class IfLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份，判断是否是闰年：");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "年是闰年");
            return;
        }
        if (year % 400 == 0){
            System.out.println(year + "年是闰年");
            return;
        }
        System.out.println(year + "年不是闰年");
    }
}
