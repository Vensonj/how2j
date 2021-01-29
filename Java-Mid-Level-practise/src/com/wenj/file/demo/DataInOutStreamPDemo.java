package com.wenj.file.demo;

import java.io.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 13 17:03 星期三
 * @description: 要求
 * 第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
 * 注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
 * <p>
 * 第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
 */
public class DataInOutStreamPDemo {
    /*public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        File f = new File("d:/lol.txt");
        try (
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
        ) {
//            boolean b = dis.readBoolean();
            int i1 = dis.readInt();
            int i2 = dis.readInt();
//            String str = dis.readUTF();

//            System.out.println("读取到布尔值:" + b);
            System.out.println("读取到整数:" + i1);
            System.out.println("读取到整数:" + i2);
//            System.out.println("读取到字符串:" + str);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void write() {
        File f = new File("d:/lol.txt");
        try (
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
        ) {
//            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeInt(700);
//            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

   /* public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        File f = new File("d:/lol.txt");
        try (
                FileInputStream fis = new FileInputStream(f);
                BufferedInputStream bis = new BufferedInputStream(fis);
        ) {
            byte[] b = new byte[(int) f.length()];
            bis.read(b);
            for (byte b1 : b) {
                System.out.println("读取到整数:" + b1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void write() {
        File f = new File("d:/lol.txt");
        try (
                FileOutputStream fos = new FileOutputStream(f);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            byte[] bytes = {(byte) 300, (byte) 700};
            bos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

    public static void main(String[] args) {
        write();
        read();

    }

    private static void read() {
        File f = new File("d:/lol.txt");
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        ) {
//            byte[] b = new byte[(int) f.length()];
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                System.out.println("读取到整数：" + Integer.parseInt(line));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void write() {
        File f = new File("d:/lol.txt");
        try (
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String s = "100,200";
            String[] strings = s.split(",");
            for (String string : strings) {
                bw.write(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
