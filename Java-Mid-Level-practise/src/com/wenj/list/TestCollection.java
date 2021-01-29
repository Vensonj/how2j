package com.wenj.list;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 21 17:02 星期四
 * @description:
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        //insertFirst(l, "ArrayList");
        //insertLast(l, "ArrayList");
        insertMid(l, "ArrayList");

        l = new LinkedList<>();
        //insertFirst(l, "LinkedList");
//        insertLast(l, "LinkedList");
        insertMid(l, "LinkedList");

    }

    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }

    private static void insertLast(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最后面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }

    private static void insertMid(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(l.size() / 2, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最中件插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }

}
