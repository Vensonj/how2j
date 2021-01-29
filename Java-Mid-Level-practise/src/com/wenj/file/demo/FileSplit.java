package com.wenj.file.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 13:14 星期三
 * @description: 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
 * 比如文件 eclipse.exe，大小是309k。
 * 拆分之后，成为
 * eclipse.exe-0
 * eclipse.exe-1
 * eclipse.exe-2
 * eclipse.exe-3
 */
public class FileSplit {
    public static void main(String[] args) {
        String path = "D:\\Document\\常用文件\\设备.dwg";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File(path);
            System.out.println();
            fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            fis.read(b);
            int l = (int) (file.length() / (100 * 1024));
            int len = (int) (file.length() / l);
            file.delete();
            for (int i = 0; i < l + 1; i++) {
                fos = new FileOutputStream(path + "-" + i);
                if (i == l) {
                    fos.write(b, i * len, (int) file.length() - len * l);
                } else
                    fos.write(b, i * len, len);
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
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
