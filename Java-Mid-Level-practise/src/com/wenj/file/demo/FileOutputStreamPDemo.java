package com.wenj.file.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 11:43 星期三
 * @description: 以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
 * 但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
 * 那么怎么自动创建xyz目录？
 * 如果是多层目录 d:/xyz/abc/def/lol2.txt 呢
 */
public class FileOutputStreamPDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = null;
        try {
            File file = new File("D:\\LOL2\\Star1\\LOL.txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            byte[] b = {66, 65};
            f = new FileOutputStream(file);
            f.write(b);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert f != null;
            f.close();
            System.out.println();
        }
    }
}
