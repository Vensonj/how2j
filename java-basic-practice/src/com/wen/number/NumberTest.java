package com.wen.number;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 13:09
 * @description: 测试基本数据类型和对应的封装类
 */
public class NumberTest {
    public static void main(String[] args) {
        Double d1 = 3.14;
        //方法一: 数字转为字符串
        // String s = d1.toString(d1);
        //方法二: 数字转为字符串
        String s = String.valueOf(d1.doubleValue());
        System.out.println(s);

        //字符串转为数字
        //double v = Double.parseDouble("3.1a4"); // throw NumberFormatException exception
        double v = Double.parseDouble(s);
        System.out.println(v);

    }
}
