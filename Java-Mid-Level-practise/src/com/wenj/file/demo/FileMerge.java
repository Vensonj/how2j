package com.wenj.file.demo;

import java.io.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 13:14 星期三
 * @description: 把上述拆分出来的文件，合并成一个原文件。
 * 以是否能正常运行，验证合并是否正确
 */
public class FileMerge {
    public static void main(String[] args) {
        /*String path = "D:\\Document\\常用文件\\设备.dwg";
        FileOutputStream fos = null;
        try {
            File file = new File(path);
            fos = new FileOutputStream(file);
            for (int i = 0; i < 4; i++) {
                File subFile = new File(path + "-" + i);
                FileInputStream fis = new FileInputStream(subFile);
                byte[] b = new byte[(int) subFile.length()];
                fis.read(b);
                fis.close();
                fos.write(b);
                subFile.delete();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        String path = "D:\\Document\\常用文件\\设备.dwg";
        FileOutputStream fos = null;
        File file = new File(path);
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 4; i++) {
            File subFile = new File(path + "-" + i);
            try (FileInputStream fis = new FileInputStream(subFile)) {
                byte[] b = new byte[(int) subFile.length()];
                fis.read(b);
                fis.close();
                fos.write(b);
                subFile.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (fos != null)
                fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
