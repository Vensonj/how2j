package com.wen.object.practice;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 04 星期一 11:25
 * @description: 根据UML类创建pet（宠物）接口
 * 1. 提供getName() 返回该宠物的名字
 * 2. 提供setName(String name) 为该宠物命名
 * 3. 提供 play()方法
 */
public interface Pet {
    String getName();
    void setName(String name);
    void play();
}
