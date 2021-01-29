package com.wenj.file.demo;

import java.io.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 9:38 星期四
 * @description:
 */
public class ObjectInOutStreamDemo {
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h1 = new Hero();
        h1.name = "wenjie";
        h1.hp = 666;

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
            Hero h2 = (Hero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);

        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Hero implements Serializable {
    private static final long SERIALIZABLEID = 1L;
    public String name;
    public float hp;
}