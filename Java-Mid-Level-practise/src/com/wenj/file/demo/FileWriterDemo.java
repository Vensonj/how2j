package com.wenj.file.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 14:41 星期三
 * @description:
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("D:\\lol1.txt");
        try (FileWriter fw = new FileWriter(file);) {
            String s = "wenjie";
            char[] c = s.toCharArray();
            fw.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
