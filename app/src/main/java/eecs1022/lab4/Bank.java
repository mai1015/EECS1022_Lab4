package eecs1022.lab4;

/**
 * Created by mai1015 on 2018-03-01.
 */

public class Bank {
    private Client clienta, clientb, clientc;

    public Bank(Client clienta, Client clientb, Client clientc) {
        this.clienta = clienta;
        this.clientb = clientb;
        this.clientc = clientc;
    }

    public Client getClient(String name) {
        switch (name) {
            case "Client 1":
                return clienta;
            case "Client 2":
                return clientb;
            case "Client 3":
                return clientc;
        }
        return null;
    }

    public boolean doAction(String action, Client from, Client to, double amount) {
        switch (action) {
            case "deposit":
                if (to != null)
                    return deposit(to, amount);
                break;
            case "withdraw":
                if (from != null)
                    return withdraw(from, amount);
                break;
            case "transfer":
                if (from != null && to != null)
                    return transfer(from, to, amount);
                break;
        }
        return false;
    }

    public boolean transfer(Client from, Client to, double amount) {
        if (from.withdraw(amount)) {
            return to.deposit(amount);
        }
        return false;
    }

    public boolean withdraw(Client from, double amount) {
        return from.withdraw(amount);
    }

    public boolean deposit(Client to, double amount) {
        return to.deposit(amount);
    }
}
