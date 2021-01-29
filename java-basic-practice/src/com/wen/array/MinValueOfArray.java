package com.wen.array;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2020/12/30 0030
 * @description: 首先创建一个长度是5的数组
 * 然后给数组的每一位赋予随机整数
 * 通过for循环，遍历数组，找出最小的一个值出来
 */
public class MinValueOfArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        CreateArr.createArr(array);
        System.out.println(Arrays.toString(array));
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i]< minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }
}
