package com.wen.array;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 10:22
 * @description: 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 * 找出这个二维数组里，最大的那个值，并打印出其二维坐标
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        /*System.out.println(array.length);*/

        int firstIndex = 0;
        int secondIndex = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                System.out.println("============"+array[i].length);
                array[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(array[i][j] + "\t");
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
            System.out.println();
        }
        System.out.println("此二维数组中的最大值为：" + maxValue + "\n" + "在数组中的坐标是：[" + firstIndex + "][" + secondIndex + "]");

    }
}
