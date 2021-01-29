package com.wen.object.practice;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 11:27
 * @description: 1. 该类必须包含String属性来存宠物的名字。
 * 2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
 * 3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
 * 4. 实现Pet接口方法。
 * 5. 实现eat方法。
 */
public class Cat extends Animal implements Pet {
    Cat() {
        this(4, "kitty");
    }

    protected Cat(int legs, String name) {
        super(legs, name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃猫粮");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + "和老鼠玩得很开心!!!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.play();
        cat.walk();
        System.out.println(cat.getName());
        System.out.println("=====================");
        cat.setName("毛妮");
        cat.eat();
        cat.play();
        cat.walk();
        System.out.println(cat.getName());
    }
}
