package com.wenj.file.demo;

import java.io.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 16:38 星期三
 * @description: 设计一个方法，用于移除Java文件中的注释
 * public void removeComments(File javaFile)
 * 比如，移出以//开头的注释行
 * File f = new File("d:/LOLFolder/LOL.exe");
 * System.out.println("当前文件是：" +f);
 * //文件是否存在
 * System.out.println("判断是否存在："+f.exists());
 * //是否是文件夹
 * System.out.println("判断是否是文件夹："+f.isDirectory());
 */
public class FileBufferedReaderPDemo {
    public static void main(String[] args) {
        File file = new File("d:/lol1.txt");
        removeComments(file);
    }
    public static void removeComments(File file) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(file); BufferedReader bur = new BufferedReader(fr);
             FileWriter fw = new FileWriter(new File("d:/lol2.txt")); PrintWriter pw = new PrintWriter(fw)) {
            while (true) {
                String line = bur.readLine();
                if (null == line)
                    break;
                if (line.trim().length() > 0 && !line.trim().startsWith("//"))
                    sb.append(line).append("\r\n");
            }
            pw.println(sb);
            System.out.print(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
