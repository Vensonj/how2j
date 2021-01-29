package com.wen.object;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 14:57
 * @description: 饿汉式
 */
public class HungryMan {
    private HungryMan(){}
    private static HungryMan createInstance;
    public static HungryMan getInstance(){
        if (createInstance != null){
            createInstance = new HungryMan();
        }
        return createInstance;
    }
}
