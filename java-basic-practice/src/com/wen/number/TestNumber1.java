package com.wen.number;

import java.util.ArrayList;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 13:37
 * @description: 统计找出一千万以内，一共有多少质数
 * 质数概念: 只能被1和自己整除的数
 * 举例:
 * 5只能被 1和5整除，所以是质数
 * 8可以被2整除，所以不是质数
 * 2是最小的质数
 */
public class TestNumber1 {
    public static void main(String[] args) {

        /*方法1:
        int max = (int) Math.pow(10,7);
        System.out.println(max);
        long start = System.currentTimeMillis();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 10000000; i++) {
            boolean flag = false;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0 && i != j && j != 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                list.add(i);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了\t"+(end-start)+"\t毫秒");
        System.out.println("一千万以内，一共有" + count + "个质数");*/
        //System.out.println(list);



       /*
       方法2:
       int max = (int) Math.pow(10, 7);
//        System.out.println(max);
        long start = System.currentTimeMillis();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            int j = 1;
            boolean flag = false;
            while (true) {
                if (i % j == 0 && i != j && j != 1) {
                    flag = true;
                    break;
                }
                if (Math.sqrt(i) <= j)
                    break;
                j++;
            }
            if (!flag) {
                list.add(i);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了\t" + (end - start) + "\t毫秒");
        System.out.println("一千万以内，一共有" + count + "个质数");
        //System.out.println(list);*/

        //方法3:
        int max_value = (int) Math.pow(10, 7);
        long start = System.currentTimeMillis();
        int sum = 0; //统计质数个数
         /*boolean 数组初始化全是false，而且只占一个bit，占用空间很小
          所以用筛选法将合数全部置true，剩下的false就是质数，最后统计false数量即可*/

        boolean[] judge = new boolean[max_value];
        judge[1] = true;   //0这个位置不要，1的位置代表数字1，2的位置代表数字2，以此类推
        for (int i = 2; i <= 10-1; i++) {
            if (!judge[i])   // 如果是质数，就把他的倍数都置true
            {
                sum += 1; //当场统计
                for (int j = 2; j * i < 10; j++)
                    judge[i * j] = true;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了\t" + (end - start) + "\t毫秒");
        System.out.println("1000W数字内的质数有" + sum + "个");
    }
}
