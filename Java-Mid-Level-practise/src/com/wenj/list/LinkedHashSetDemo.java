package com.wenj.list;

import java.util.LinkedHashSet;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 25 10:58 星期一
 * @description: 利用LinkedHashSet的既不重复，又有顺序的特性，把Math.PI中的数字，按照出现顺序打印出来，相同数字，只出现一次
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        char[] chars = String.valueOf(Math.PI).toCharArray();
        for (char c : chars) {
            if (".".equals(String.valueOf(c)))
                continue;
            linkedHashSet.add(c);
        }
        System.out.println(linkedHashSet);
    }
}
