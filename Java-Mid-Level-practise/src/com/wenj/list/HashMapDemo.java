package com.wenj.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 20 10:26 星期三
 * @description: 准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
 * hero-3229
 * hero-6232
 * hero-9365
 * ...
 * <p>
 * 因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
 * 要求使用两种办法来寻找
 * 1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
 * 2. 借助HashMap，找出结果，并统计花费的时间
 */
public class HashMapDemo {
    public static void main(String[] args) {
        int capacity = 3000000;
        ArrayList<Hero> heroes = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            heroes.add(new Hero("hero-" + (int) (Math.random() * 10000 + 1)));
        }
        String str = "hero-5555";


        withoutHashMap(heroes, capacity, str);
        withHashMap(heroes, capacity, str);
    }

    public static void withoutHashMap(List<Hero> heroes, int capacity, String str) {
        long start = System.currentTimeMillis();
        int counter = 0;
        for (Hero hero : heroes) {
            if (hero.name.equals(str)) {
                System.out.println(hero);
                ++counter;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("总共有" + counter + "个相同元素");
        System.out.println("花费了" + (end - start) + "ms");
    }

    public static void withHashMap(List<Hero> heroes, int capacity, String str) {
        long start = System.currentTimeMillis();
        int counter = 0;
        int counter1 = 0;
        HashMap<Integer, Hero> heroHashMap = new HashMap<>();
        for (Hero hero : heroes) {
            heroHashMap.put(++counter, hero);
        }
        for (int i = 1; i < heroHashMap.size(); i++) {
            if (heroHashMap.get(i).name.equals(str)) {
                ++counter1;
                System.out.println(heroHashMap.get(i));
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("总共有" + counter1 + "个相同元素");
        System.out.println("花费了" + (end - start) + "ms");
    }

}

