package com.wen.array;

import java.nio.file.FileStore;
import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 9:49
 * @description: 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
 * 然后准备第三个数组，第三个数组的长度是前两个的和
 * 通过System.arraycopy 把前两个数组合并到第三个数组中
 * System.arraycopy(src, srcPos, dest, destPos, length)
 * src: 源数组
 * srcPos: 从源数组复制数据的起始位置
 * dest: 目标数组
 * destPos: 复制到目标数组的启始位置
 * length: 复制的长度
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] firstArray = new int[(int) (Math.random() * 6 + 5)];
        int[] secondArray = new int[(int) (Math.random() * 6 + 5)];
        int[] thirdArray = new int[firstArray.length+secondArray.length];
        /*System.out.println(firstArray.length);
        System.out.println(secondArray.length);
        System.out.println(thirdArray.length);*/
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("第一个数组内容是：" + Arrays.toString(firstArray));
        System.out.println("第二个数组内容是：" + Arrays.toString(secondArray));
        System.arraycopy(firstArray,0,thirdArray,0,firstArray.length);
        System.arraycopy(secondArray,0,thirdArray,firstArray.length,secondArray.length);
        System.out.println("第三个数组内容是：" + Arrays.toString(thirdArray));

    }
}
