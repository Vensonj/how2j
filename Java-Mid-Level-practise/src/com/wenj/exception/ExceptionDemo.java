package com.wenj.exception;

import java.io.File;
import java.io.FileInputStream;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 16:24 星期二
 * @description:
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        File file = new File("d:/LOL.exe");
        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(file);
            System.out.println("成功打开");
        } catch (Throwable e) {
            if (e instanceof Exception) {
                System.out.println("d:/LOL.exe不存在,exception");
                e.printStackTrace();
            }
            if (e instanceof Error){
                System.out.println("d:/LOL.exe不存在,error");
                e.printStackTrace();
            }
        }
    }
}
