package com.wen.array;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 16:22
 * @description: 首先创建一个长度是5的数组, 并填充随机数。 (向数组填充随机数的办法，参考这里)
 * 首先用选择法正排序，然后再对其使用冒泡法倒排序
 * 注:所谓的正排序就是从小到大排序，倒排序就是从大到小排序
 */
public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        CreateArr.createArr(array);
        /*选择排序:
        * 选择法排序的思路：
            把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来比较完后，第一位就是最小的
            然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来比较完后，第二位就是第二小的
            以此类推*/
        /*for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0]) {
                int temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }
        }
        System.out.println("第1轮排序后数组：" + Arrays.toString(array));
        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[1]) {
                int temp = array[i];
                array[i] = array[1];
                array[1] = temp;
            }
        }
        System.out.println("第2轮排序后数组：" + Arrays.toString(array));
        for (int i = 3; i < array.length; i++) {
            if (array[i] < array[2]) {
                int temp = array[i];
                array[i] = array[2];
                array[2] = temp;
            }
        }
        System.out.println("第3轮排序后数组：" + Arrays.toString(array));
        for (int i = 4; i < array.length; i++) {
            if (array[i] < array[3]) {
                int temp = array[i];
                array[i] = array[3];
                array[3] = temp;
            }
        }
        System.out.println("第4轮排序后数组：" + Arrays.toString(array));*/

        /*for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("排序后数组：" + Arrays.toString(array));*/

        /*
        冒泡法排序的思路：
        第一步：从第一位开始，把相邻两位进行比较如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
        第二步： 再来一次，只不过不用比较最后一次以此类推
         */
        /*for (int i = 3; i >=0; i--) {
            if (array[i] > array[array.length-1]) {
                int temp = array[i];
                array[i] = array[array.length-1];
                array[array.length-1] = temp;
            }
        }
        System.out.println("第1轮冒泡后数组：" + Arrays.toString(array));

        for (int i = 2; i >=0; i--) {
            if (array[i] > array[array.length-1-1]) {
                int temp = array[i];
                array[i] = array[array.length-1-1];
                array[array.length-1-1] = temp;
            }
        }
        System.out.println("第2轮冒泡后数组：" + Arrays.toString(array));

        for (int i = 1; i >=0; i--) {
            if (array[i] > array[array.length-1-1-1]) {
                int temp = array[i];
                array[i] = array[array.length-1-1-1];
                array[array.length-1-1-1] = temp;
            }
        }
        System.out.println("第3轮冒泡后数组：" + Arrays.toString(array));

        for (int i = 0; i >=0; i--) {
            if (array[i] > array[array.length-1-1-1-1]) {
                int temp = array[i];
                array[i] = array[array.length-1-1-1-1];
                array[array.length-1-1-1-1] = temp;
            }
        }
        System.out.println("第4轮冒泡后数组：" + Arrays.toString(array));*/

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("排序后数组：" + Arrays.toString(array));
    }
}
