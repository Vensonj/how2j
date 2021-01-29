package com.wenj.file.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 11:33 星期三
 * @description:
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fis = null;
        try {
            File file = new File("D:\\LOL1.txt");
            fis = new FileOutputStream(file);
            byte[] bytes = new byte[]{65,66};
            fis.write(bytes);
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
