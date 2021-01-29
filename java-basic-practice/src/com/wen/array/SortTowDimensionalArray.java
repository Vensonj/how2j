package com.wen.array;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 11:30
 * @description: 首先定义一个5X8的二维数组，然后使用随机数填充满。
 * 借助Arrays的方法对二维数组进行排序。
 * 参考思路：
 * 先把二维数组使用System.arraycopy进行数组复制到一个一维数组
 * 然后使用sort进行排序
 * 最后再复制回到二维数组。
 */
public class SortTowDimensionalArray {
    public static void main(String[] args) {
        /*int[][] srcArray = new int[5][8];
        int[] destArray = new int[40];
        int destPosition = 0;
        for (int i = 0; i < srcArray.length; i++) {
            for (int j = 0; j < srcArray[i].length; j++) {
                srcArray[i][j] = (int) (Math.random() * 100 + 1);
            }
            *//*System.out.println(Arrays.toString(srcArray[i])+"----------");*//*

            //将二维数组copy到一维数组中
            System.arraycopy(srcArray[i], 0, destArray, destPosition, 8);
            destPosition +=8;
//            System.out.println(Arrays.toString(destArray)+"**************");
        }
        System.out.println("排序前的二维数组：" + Arrays.deepToString(srcArray));

        *//*Arrays.sort(srcArray); //sort方法只能传入一维数组*//*
        //再将一位数组排序并重新转成二维数组
        Arrays.sort(destArray);

        int k = 0;
        for (int i = 0; i < srcArray.length; i++) {
            for (int j = 0; j < srcArray[i].length; j++) {
                srcArray[i][j] = destArray[k++];
            }
            System.out.println();
        }
        System.out.println("排序后的二维数组：" + Arrays.deepToString(srcArray));
    }*/
        int firstIndex = 5, secondIndex = 8;
        int[][] srcArray = new int[firstIndex][secondIndex];
        int[] destArray = new int[firstIndex * secondIndex];
        for (int i = 0; i < srcArray.length; i++) {
            for (int j = 0; j < srcArray[i].length; j++) {
                //给二维数组随机赋值
                srcArray[i][j] = (int) (Math.random() * 100 + 1);
            }
            //将二维数组copy到一维数组中
            System.arraycopy(srcArray[i], 0, destArray, i * secondIndex, secondIndex);
        }
        System.out.println("排序前的二维数组：" + Arrays.deepToString(srcArray));

        //将一位数组排序
        Arrays.sort(destArray);

        int k = 0;
        for (int i = 0; i < srcArray.length; i++) {
            for (int j = 0; j < srcArray[i].length; j++) {
                //将排序后的一位数组重新转成二维数组
                System.arraycopy(destArray, i*8, srcArray[i], 0, secondIndex);
            }
        }
        System.out.println("排序后的二维数组：" + Arrays.deepToString(srcArray));
    }
}
