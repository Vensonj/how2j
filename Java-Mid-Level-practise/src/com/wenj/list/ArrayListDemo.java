package com.wenj.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 15:39 星期四
 * @description: 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
 * hero 0
 * hero 1
 * hero 2
 * ...
 * hero 99.
 * <p>
 * 通过遍历的手段，删除掉名字编号是8的倍数的对象
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Hero("hero " + i));

        }
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            String[] s = hero.name.split(" ");
            for (int j = 1; j < s.length; j++) {
                if (Integer.parseInt(s[j]) % 8 == 0) {
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
}

class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
