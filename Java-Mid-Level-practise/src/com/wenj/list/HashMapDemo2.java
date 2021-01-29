package com.wenj.list;

import java.util.HashMap;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 21 17:23 星期四
 * @description: 使用如下键值对，初始化一个HashMap：
 * adc - 物理英雄
 * apc - 魔法英雄
 * t - 坦克
 * <p>
 * 对这个HashMap进行反转，key变成value,value变成key
 * 提示： keySet()可以获取所有的key, values()可以获取所有的value
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("adc", "物理英雄");
        map.put("apc", "魔法英雄");
        map.put("t", "坦克");
        Object[] keySet = map.keySet().toArray();
        Object[] values = map.values().toArray();
        map.clear();
        for (int i = 0; i < keySet.length; i++){
            map.put((String) values[i],(String) keySet[i]);
        }
        System.out.println(map);
    }
}
