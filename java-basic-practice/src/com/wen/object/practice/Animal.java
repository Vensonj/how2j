package com.wen.object.practice;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 04 星期一 10:57
 * @description: 1. 创建Animal类，它是所有动物的抽象(abstract class))父类。
 * 2. 声明一个受保护(protected)的整数类型属性legs，它记录动物的腿的数目。
 * 3. 定义一个受保护(protected)的构造器，用来初始化legs属性。
 * 4. 声明抽象方法eat。
 * 5. 声明具体方法walk来打印动物是如何行走的（包括腿的数目）。
 */
public abstract class Animal {
    protected int legs; //记录动物的腿的数目
    protected String name; // 动物名
    protected Animal(int legs,String name) {
        this.legs = legs;
        this.name = name;
    }

    public abstract void eat();

    public void walk() {
        System.out.println(name + "是靠" + legs + "条腿行走的");
    }
}
