package com.wenj.exception;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 12 18:04 星期二
 * @description:
 */
public class CheckingAccount extends Account {
    private double overdraftProtection; //透支额度

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public void withdraw(double money) throws OverdraftException, ErrorNumberException {
        if (money < 0)
            throw new ErrorNumberException("对不起，您输入的金额不合法，请重新输入~~~，谢谢");
        if (getBalance() > money | getBalance() == money)
            this.balance -= money;
        else {
            if (getBalance() + overdraftProtection > money) {
                this.overdraftProtection -= (money-getBalance());
                this.balance = 0;
            } else
                throw new OverdraftException("余额不足~~~", money - getBalance() - overdraftProtection);
        }
    }

    public static void main(String[] args) throws OverdraftException, ErrorNumberException {
        CheckingAccount ck = new CheckingAccount(1000, 2000);
        ck.withdraw(1100);
        System.out.println(ck.getBalance());
        System.out.println("您的可用透支额度为" + ck.getOverdraftProtection());
    }
}
