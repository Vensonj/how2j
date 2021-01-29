package com.wen.controlflow;

import java.util.Scanner;

/**
 * @author Administrator
 * 使用Scanner收集你的身高体重，并计算出你的BMI值是多少
 * <p>
 * BMI的计算公式是 体重(kg) / (身高*身高)
 * <p>
 * 比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
 * 72 / (1.69*1.69) = ?
 * <p>
 * 然后通过条件判断BMI的范围，打印出是超重还是正常
 */
public class BmiCase {
    public static void main(String[] args) {
        /*方式一
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高（m）");
        float height = scanner.nextFloat();
        System.out.println("请输入体重（kg）");
        float weight = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi >= 35) {
            System.out.println(bmi);
            System.out.println("重度肥胖");
            return;
        }
        if (bmi >= 30) {
            System.out.println(bmi);
            System.out.println("中度肥胖");
            return;
        }
        if (bmi >= 27) {
            System.out.println(bmi);
            System.out.println("轻度肥胖");
            return;
        }
        if (bmi >= 24) {
            System.out.println(bmi);
            System.out.println("体重过重");
            return;
        }
        if (bmi >= 18.5) {
            System.out.println(bmi);
            System.out.println("正常范围");
            return;
        }
        if (bmi < 18.5) {
            System.out.println(bmi);
            System.out.println("体重过轻");
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高（m）");
        float height = scanner.nextFloat();
        System.out.println("请输入体重（kg）");
        float weight = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi >= 35) {
            System.out.println(bmi);
            System.out.println("重度肥胖");
        }
        else if (bmi >= 30) {
            System.out.println(bmi);
            System.out.println("中度肥胖");
        }
        else if (bmi >= 27) {
            System.out.println(bmi);
            System.out.println("轻度肥胖");
        }
        else if (bmi >= 24) {
            System.out.println(bmi);
            System.out.println("体重过重");
        }
        else if (bmi >= 18.5) {
            System.out.println(bmi);
            System.out.println("正常范围");
        }
        else {
            System.out.println(bmi);
            System.out.println("体重过轻");
        }
    }
}
