package com.wenj.generic;

import java.util.ArrayList;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 26 10:17 星期二
 * @description: 根据数字类-Number 的知识，设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Number> numberArrayList = new ArrayList<>();
        //numberArrayList.add("123");
        numberArrayList.add(123);
        numberArrayList.add(12.3);
        System.out.println(numberArrayList);
    }
}
