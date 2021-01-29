package com.wen.array;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 17:14
 * @description:
 * 用增强型for循环找出最大的那个数
 */
public class Case1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        CreateArr.createArr(array);
        System.out.println("数组：" + Arrays.toString(array));

        int temp = 0;
        for (int maxValue : array){
            if (maxValue>temp){
                temp = maxValue;
            }
        }
        System.out.println(temp);
    }
}
