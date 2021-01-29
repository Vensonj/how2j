package com.wenj.file.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 15:03 星期三
 * @description: 准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
 * 设计一个方法
 * public static void encodeFile(File encodingFile, File encodedFile);
 * 在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
 * 加密算法：
 * 数字：
 * 如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
 * 如果是9的数字，变成0
 * 字母字符：
 * 如果是非z字符，向右移动一个，比如d变成e, G变成H
 * 如果是z，z->a, Z-A。
 * 字符需要保留大小写
 * 非字母字符
 * 比如',&^ 保留不变，中文也保留不变
 */
public class FileReaderWriterPDemo {
    public static void main(String[] args) {
        File srcFile = new File("D:\\test.txt");
        File destFile = new File("D:\\test1.txt");
        File dest2File = new File("D:\\test2.txt");

        encodeFile(srcFile,destFile);
        decodeFile(destFile,dest2File);

    }

    public static void encodeFile(File srcFile, File destFile) {
        //先读取源文件中的内容，进行加密
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            fr.read(chars);
            for (int i = 0; i < chars.length; i++) {
                int k;
                if (chars[i] == '9')
                    chars[i] = '0';
                if (Character.isDigit(chars[i]) && chars[i] != '9')
                    chars[i] += 1;
                if (chars[i] == 'z')
                    chars[i] = 'a';
                if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i]) && chars[i] != 'z') {
                    k = chars[i];
                    k += 1;
                    chars[i] = (char) k;
                }
                if (chars[i] == 'Z')
                    chars[i] = 'A';
                if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i]) && chars[i] != 'Z') {
                    k = chars[i];
                    k += 1;
                    chars[i] += (char) k;
                }
            }
            //再将加密后的写入目标文件
            fw = new FileWriter(destFile);
            fw.write(chars);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void decodeFile(File srcFile, File destFile) {
        //先读取源文件中的内容，进行解密
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            fr.read(chars);
            for (int i = 0; i < chars.length; i++) {
                int k;
                if (chars[i] == '0')
                    chars[i] = '9';
                if (Character.isDigit(chars[i]) && chars[i] != '0')
                    chars[i] -= 1;
                if (chars[i] == 'a')
                    chars[i] = 'z';
                if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i]) && chars[i] != 'a') {
                    k = chars[i];
                    k -= 1;
                    chars[i] = (char) k;
                }
                if (chars[i] == 'A')
                    chars[i] = 'Z';
                if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i]) && chars[i] != 'A') {
                    k = chars[i];
                    k -= 1;
                    chars[i] += (char) k;
                }
            }
            //再将加密后的写入目标文件
            fw = new FileWriter(destFile);
            fw.write(chars);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
