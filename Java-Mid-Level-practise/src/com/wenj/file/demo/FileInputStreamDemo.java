package com.wenj.file.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 11:33 星期三
 * @description:
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("D:\\LOL.txt");
            fis = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            fis.read(bytes);
            for (byte b : bytes) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
