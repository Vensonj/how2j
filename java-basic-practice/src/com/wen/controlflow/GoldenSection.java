package com.wen.controlflow;

/**
 * @author Administrator
 * 2020-12-25 12:32
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class GoldenSection {
    public static void main(String[] args) {
        int denominator = 0;//分母
        int molecule = 0;//分子
        double temp = 10;
        double result = 0;
        for (int i = 1; i <= 300; i++) {
            for (int j = 1; j <= 200; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    continue;
                }
                result = j / (double)i;
                if (Math.abs(result - 0.618) < temp) {
                    denominator = i;
                    molecule = j;
                    temp = Math.abs(result-0.618);
                }
            }
        }
        System.out.println("离黄金分割点 0.618 最近的的两个数是: " + molecule + "÷" + denominator + "值为：" + ((double)molecule/denominator));
    }
}
