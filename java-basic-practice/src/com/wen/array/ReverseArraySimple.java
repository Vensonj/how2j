package com.wen.array;

import com.wen.number.customize.SelfStringBuffer;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 15:04
 * @description: 首先创建一个长度是5的数组, 并填充随机数。
 * 使用for循环或者while循环，对这个数组实现反转效果
 */
public class ReverseArraySimple {
    public static void main(String[] args) {
        int[] array = new int[5];
        CreateArr.createArr(array);
        System.out.println("反转前数组：" + Arrays.toString(array));
        /*
        for循环
        int counter = 0;
        for (int i = 0; i <= Math.sqrt(array.length); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            counter++;
        }
        System.out.println("反转后数组：" + Arrays.toString(array));
        System.out.println("交换了" + counter + "次");*/

        //while循环
        /*int counter = 0;
        int k = 0;
        while (k <= Math.sqrt(array.length)) {
            int temp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = temp;
            counter++;
            k++;
        }
        System.out.println("反转后数组：" + Arrays.toString(array));
        System.out.println("交换了" + counter + "次");*/


    }
}

