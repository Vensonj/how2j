package com.wenj.exception;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 17:42 星期二
 * @description:
 */
public class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException() {

    }

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
        System.out.println("您账户还差" + deficit + "余额");
    }

    public double getDeficit() {
        return deficit;
    }
}
