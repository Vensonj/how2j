package com.wenj.file.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 14:41 星期三
 * @description:
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        File file = new File("D:\\lol.txt");
        try (FileReader fr = new FileReader(file);) {
            char[] c = new char[(int) file.length()];
            fr.read(c);
            for (char ch : c) {
                System.out.print(ch + "\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
