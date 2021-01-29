package com.wenj.list;

import java.util.HashSet;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 21 16:52 星期四
 * @description: 生成50个 0-9999之间的随机数，要求不能有重复的
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        do {
            int num = (int) (Math.random() * 10000);
            hashSet.add(num);
        } while (hashSet.size() != 50);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
