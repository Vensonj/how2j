package com.wen.object;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 14:51
 * @description: 懒汉式
 */
public class LazyMan {
    //私有化构造器
    private LazyMan(){}
    private static final LazyMan createInstance = new LazyMan();
    public static LazyMan getInstance(){
        return createInstance;
    }
}
