package com.wen.number;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 08 周五 12:36
 * @description: String与StringBuffer的性能区别?
 * 生成10位长度的随机字符串
 * 然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
 * 然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
 */
public class StringTest3 {
    public static void main(String[] args) {
       /* long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 += StringTest.randomStringOfLength(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("String消耗的时间:" + (end - start));*/
//        System.out.println(s1.length());
//        System.out.println(s1);

        long start = System.currentTimeMillis();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s1.append(StringTest.randomStringOfLength(10));
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder消耗的时间:" + (end - start));
//        System.out.println(s1.length());
//        System.out.println(s1);
    }
}
