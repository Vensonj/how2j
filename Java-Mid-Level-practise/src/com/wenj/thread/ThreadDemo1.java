package com.wenj.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 26 15:18 星期二
 * @description: 1. 生成一个长度是3的随机字符串，把这个字符串当作 密码
 * <p>
 * 2. 创建一个破解线程，使用穷举法，匹配这个密码
 * <p>
 * 3. 创建一个日志线程，打印都用过哪些字符串去匹配，这个日志线程设计为守护线程
 * <p>
 * 提示： 破解线程把穷举法生成的可能密码放在一个容器中，日志线程不断的从这个容器中拿出可能密码，并打印出来。 如果发现容器是空的，就休息1秒，
 * 如果发现不是空的，就不停的取出，并打印。
 */
public class ThreadDemo1 {
    private static Queue<String> queue = new LinkedList<>();
    private static int counter = 0;

    public static void main(String[] args) {

        String str = "WcB";
        Thread t1 = new Thread(() -> {
            matched(str);
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (queue.isEmpty()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(queue.poll());
                }
            }

        });
        t2.setDaemon(true);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();

    }

    public static void matched(String str) {

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }
        for (int c = 0; c <= 9; c++) {
            sb.append(c);
        }
        for (int i = 0; i < sb.length(); i++) {
            String newstr;
            for (int j = 0; j < sb.length(); j++) {
                for (int k = 0; k < sb.length(); k++) {
                    newstr = sb.charAt(i) + String.valueOf(sb.charAt(j)) + sb.charAt(k);
                    if (newstr.equals(str))
                        return;
                    queue.add(newstr);
                    ++counter;
                }
            }
        }
    }
}
