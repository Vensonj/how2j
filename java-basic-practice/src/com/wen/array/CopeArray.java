package com.wen.array;


import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 11:18
 * @description: 与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
 * 不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。
 * copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
 * 除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
 * 此外，还有copyOf(源数组,目标数组长度),如果比源数组长度小,截取源数组相应长度的数据填充至目标数组，如果比源数组长度大，多出的长度用0填充
 */
public class CopeArray {
    public static void main(String[] args) {
        int[] srcArray = new int[5];
        for (int i = 0; i < srcArray.length; i++) {
            srcArray[i] = (int) (Math.random() * 100 + 1);
        }
        int[] destArray = Arrays.copyOf(srcArray,3);
        System.out.println("源数组为：" +Arrays.toString(srcArray) );
        System.out.println("目标数组为："+Arrays.toString(destArray));
    }
}
