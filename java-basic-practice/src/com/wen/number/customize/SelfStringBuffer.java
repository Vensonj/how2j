package com.wen.number.customize;

import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2021 01 08 周五 13:09
 * @description: 自定义的StringBuffer
 * value：用于存放字符数组
 * capacity： 容量
 * 无参构造方法： 根据容量初始化value
 */
public class SelfStringBuffer implements IStringBuffer {
    char[] value;
    int capacity = 16;
    int length = 0;

    //无参构造
    public SelfStringBuffer() {
        this.value = new char[capacity];
    }

    //有参构造
    public SelfStringBuffer(String str) {
        this();
        if (null == str)
            return;
        if (capacity < str.length()) {
            capacity = value.length * 2;
            value = new char[capacity];
        } else {
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
            System.out.println(value);
        }
        length =str.length();
    }




    @Override
    public void append(String str) {

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char b) {

    }

    @Override
    public void insert(int pos, String b) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        for (int i = 0; i < value.length / 2; i++) {
            char temp = value[value.length - 1 - i];
            value[value.length - 1 - i] = value[i];
            value[i] = temp;
        }
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public String toString() {
        char[] realChar = new char[length];
        System.arraycopy(value, 0, realChar, 0, length);
        return Arrays.toString(realChar);
    }

    public static void main(String[] args) {
        SelfStringBuffer selfStringBuffer = new SelfStringBuffer("123456789");
        selfStringBuffer.reverse();
        System.out.println(selfStringBuffer);

    }
}
