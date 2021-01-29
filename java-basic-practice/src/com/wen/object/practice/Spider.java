package com.wen.object.practice;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 11:06
 * @description: 1. Spider继承Animal类。
 * 2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
 * 3. 实现eat方法
 */
public class Spider extends Animal {
    Spider(){
        this(8,"蜘蛛");
    }
    protected Spider(int legs, String name) {
        super(legs, name);
    }

    @Override
    public void eat() {
        System.out.println("蜘蛛是肉食动物~~~");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.walk();
    }
}

