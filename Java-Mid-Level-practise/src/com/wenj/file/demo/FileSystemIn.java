package com.wenj.file.demo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 10:08 星期四
 * @description:
 */
public class FileSystemIn {
    public static void main(String[] args) {
        InputStream is = System.in;
        while (true){
            int i;
            try {
                i = is.read();
                System.out.println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
