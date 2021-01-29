package com.wenj.thread;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 26 15:08 星期二
 * @description: 英雄有可以放一个技能叫做: 波动拳-a du gen。
 * 每隔一秒钟，可以发一次，但是只能连续发3次。
 * <p>
 * 发完3次之后，需要充能5秒钟，充满，再继续发。
 * <p>
 * 借助本章节学习到的知识点，实现这个效果
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int counter = 0;
            while (true){
                for (int i = 0; i < 3; i++) {
                    System.out.println("波动拳第" + ++counter + "发");
                }
                System.out.println("开始为时5s的充能");
                try {
                    counter = 0;
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
