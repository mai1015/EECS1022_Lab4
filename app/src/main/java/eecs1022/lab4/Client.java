package eecs1022.lab4;

/**
 * Created by mai1015 on 2018-03-01.
 */

public class Client {
    private String name;
    private double amount;

    public Client(String n, double a) {
        name = n;
        amount = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean deposit(double money) {
        if (money <= 0) return false;
        amount += money;
        return true;
    }

    public boolean withdraw(double money) {
        if (amount < money || money <= 0) return false;
        amount -= money;
        return true;
    }
}
