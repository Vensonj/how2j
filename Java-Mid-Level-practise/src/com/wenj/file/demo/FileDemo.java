package com.wenj.file.demo;

import java.io.File;
import java.util.Arrays;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 18:20 星期二
 * @description:
 */
public class FileDemo {
    public static void main(String[] args) {
        // 绝对路径
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

        File file = new File("d:/co");
        System.out.println(Arrays.toString(file.list()));

        System.out.println(Arrays.toString(file.listFiles()));

        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
    }
}
