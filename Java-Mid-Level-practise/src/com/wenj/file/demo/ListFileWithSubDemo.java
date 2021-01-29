package com.wenj.file.demo;

import java.io.File;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 18:53 星期二
 * @description: 遍历这个目录下所有的文件(遍历子目录) 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 */
public class ListFileWithSubDemo {
    private static long maxLength;
    private static long minLength = Integer.MAX_VALUE;
    private static File maxFile;
    private static File minFile;

    public static void main(String[] args) {
        File file = new File("D:\\");
        funcListFile(file);
        System.out.println("最大的文件是：" + maxFile + "\t" + "其文件大小为：" + maxLength);
        System.out.println("最小的文件是：" + minFile + "\t" + "其文件大小为：" + minLength);
    }

    public static void funcListFile(File file) {
        if (file.isFile()) {
            if (file.length() > maxLength) {
                maxLength = file.length();
                maxFile = file;
            }
            if (file.length() < minLength && file.length() != 0) {
                minLength = file.length();
                minFile = file;
            }
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    funcListFile(f);
                }
            }
        }
    }
}
