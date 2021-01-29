package com.wenj.exception;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 17:34 星期二
 * @description:
 */
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    //存钱
    public void deposit(double money) throws ErrorNumberException {
        if (money > 0)
            this.balance += money;
        else
            throw new ErrorNumberException("对不起，您输入的金额不合法，请重新输入~~~");
    }

    //取钱
    public void withdraw(double money) throws OverdraftException, ErrorNumberException {
        if (money <0)
            throw new ErrorNumberException("对不起，您输入的金额不合法，请重新输入~~~，谢谢!!!!");
        if (getBalance() > money | getBalance() == money)
            this.balance -= money;
        else
            throw new OverdraftException("余额不足~~~",money-getBalance());
    }

    public static void main(String[] args) throws ErrorNumberException, OverdraftException {
        Account account = new Account(1500);
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(3000);
        System.out.println(account.getBalance());

    }

}
