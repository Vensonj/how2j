package com.wenj.file.demo;

import java.io.*;
import java.util.Arrays;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 9:38 星期四
 * @description: 准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
 * <p>
 * 然后把该数组序列化到一个文件heros.lol
 * <p>
 * 接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
 */
public class ObjectInOutStreamPDemo {
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero1[] h1 = new Hero1[10];
        for (int i = 1; i <= 10; i++) {
            h1[i-1] = new Hero1("wenj"+i,600+i);
        }
        System.out.println("反序列化前"+Arrays.toString(h1));
        //准备一个文件用于保存该对象
        File f = new File("D:\\lol.txt");

        try (  //必须先创建对象输出流然后再是对象输入流
               //创建对象输出流
               FileOutputStream fos = new FileOutputStream(f);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               //创建对象输入流
               FileInputStream fis = new FileInputStream(f);
               ObjectInputStream ois = new ObjectInputStream(fis);) {
            oos.writeObject(h1);
            Hero1[] h2 = (Hero1[]) ois.readObject();
            System.out.println("反序列化后"+Arrays.toString(h2));

        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Hero1 implements Serializable {
    private static final long SERIALIZABLEID = 1L;
    public String name;
    public float hp;

    public Hero1(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero1{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}