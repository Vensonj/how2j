package com.wenj.file;

import java.io.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 10:16 星期四
 * @description: 1、复制文件是常见的IO操作，设计如下方法，实现复制源文件srcFile到目标文件destFile
 * <p>
 * public static void copyFile(String srcFile, String destFile){
 * }
 * 2、
 * 复制文件夹,实现如下方法，把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
 * <p>
 * public static void copyFolder(String srcFolder, String destFolder){
 * <p>
 * }
 * 3、
 * public static void search(File folder, String search);
 * <p>
 * <p>
 * 假设你的项目目录是 e:/project，遍历这个目录下所有的java文件（包括子文件夹），找出文件内容包括 Magic的那些文件，并打印出来。
 */
public class FIleTest1 extends Thread {
    public static void main(String[] args) {
        String s1 = "D:\\WJ\\2020\\P519-CQXQ\\SpotWeld\\fixture\\P519-3364&3365&3381-HJ1-OP-3D -08.13";
        String s2 = "D:\\WJ\\2020\\CX727前壁板\\作废（焊钳超负载）——焊钳修改-V2.01.ppt";
        String s3 = "prt";
//        copyFile(s1, s2);
//        copyFolder(s1, s2);
//        search(new File(s1), s3);
        searchWithThread(new File(s1), s3);
    }

    //复制文件
    public static void copyFile(String srcFile, String destFile) {
        File src = new File(srcFile);
        File dest = new File(destFile);
        try (
                FileInputStream fis = new FileInputStream(src);
                BufferedInputStream bis = new BufferedInputStream(fis);

                FileOutputStream fos = new FileOutputStream(dest);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] bytes = new byte[(int) src.length()];
            bis.read(bytes);
            bos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //复制文件夹
    public static void copyFolder(String srcFolder, String destFolder) {
        File src = new File(srcFolder);
        File dest = new File(destFolder);
        if (!dest.exists())
            dest.mkdirs();// 如果父文件夹不存在，要先创建文件夹
        if (src.isDirectory()) {
            String[] files = src.list();
            for (String file : files) {
                File f1 = new File(destFolder + "/" + file);
                File f2 = new File(srcFolder + "/" + file);
                if (f2.isFile()) {
                    try {
                        f1.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    copyFile(srcFolder + "/" + file, destFolder + "/" + file);
                }
                if (f2.isDirectory()) {
                    f1.mkdirs();
                    copyFolder(srcFolder + "/" + file, destFolder + "/" + file);
                }

            }
        } else
            System.out.println("您传入的不是正确的文件夹，请确认后再重新输入~~~");
    }

    //查找文件内容
    public static void search(File folder, String search) {
//        char[] comment = new char[(int) folder.length()];
        if (folder.exists()) {
            if (folder.isFile()) {
                try (FileReader fr = new FileReader(folder); BufferedReader br = new BufferedReader(fr)) {
                    while (true) {
                        // 一次读一行
                        String line = br.readLine();
                        if (null == line)
                            break;
                        if (line.contains(search)) {
                            System.out.println("找到字符串在" + folder.getAbsolutePath() + "\t包含" + search);
                            break;
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        search(file, search);
                    }
                } else
                    System.out.println("您输入的是空文件夹，请重新输入");
            }
        } else
            System.out.println("您输入的文件或文件夹不存在，请仔细确认后输入~~~");
    }

    //查找文件内容——改造成多线程方式查找——遍历所有文件，当遍历到文件是.java的时候，创建一个线程去查找这个文件的内容，不必等待这个线程结束，继续遍历下一个文件
    public static void searchWithThread(File folder, String search) {

        if (folder.exists()) {
            if (folder.isFile() && folder.getName().endsWith(".prt")) {
                Thread thread = new Thread(() -> {
                    try (BufferedReader br = new BufferedReader(new FileReader(folder))) {
                        while (true) {
                            String line = br.readLine();
                            if (line == null)
                                break;
                            if (line.contains(search)) {
                                System.out.println("找到字符串在" + folder.getAbsolutePath() + "\t包含" + search);
                                break;
                            }
                            /*else
                                System.out.println("没找到");*/
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            }
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        searchWithThread(file, search);
                    }
                } else
                    System.out.println("您输入的是空文件夹，请重新输入");
            }
        } else
            System.out.println("您输入的文件或文件夹不存在，请仔细确认后输入~~~");
    }
}


