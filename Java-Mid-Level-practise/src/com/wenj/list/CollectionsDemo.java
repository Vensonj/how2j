package com.wenj.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 21 16:37 星期四
 * @description: 首先初始化一个List, 长度是10，值是0-9。
 * 然后不断的shuffle，直到前3位出现
 * 3 1 4
 * <p>
 * shuffle 1000,000 次，统计出现的概率 大概0.0083
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(4);
        int max = 3000000;
        int counter = 0;
        for (int i = 0; i < max; i++) {
            Collections.shuffle(list);
            if (list.subList(0, 3).containsAll(list1)) {
                ++counter;
            }
        }
        System.out.println("总共出现" + counter + "次");
        System.out.println("发生的概率是：" + (double)counter/max);
    }
}

