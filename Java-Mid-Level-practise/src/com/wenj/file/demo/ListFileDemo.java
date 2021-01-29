package com.wenj.file.demo;

import java.io.File;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 18:53 星期二
 * @description: 遍历这个目录下所有的文件(不用遍历子目录) 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 */
public class ListFileDemo {
    private static long maxLength = 20;
    private static long minLength = 10;
    private static File maxFile;
    private static File minFile;

    public static void main(String[] args) {
        File file = new File("d:/");
        File[] listFiles = file.listFiles();
        assert listFiles != null;
        for (File listFile : listFiles) {
            if (listFile.length() > maxLength) {
                maxLength = listFile.length();
                maxFile = listFile;
            }
            if (listFile.length() < minLength) {
                minLength = listFile.length();
                minFile = listFile;
            }
        }
        System.out.println("最大的文件是：" + maxFile + "\t" + "其文件大小为：" + maxLength);
        System.out.println("最小的文件是：" + minFile + "\t" + "其文件大小为：" + minLength);
    }
}
