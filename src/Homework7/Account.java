package Homework7;

public class Account {
    private String id;
    private String holder;
    private double amount;

    public Account(String id, String holder, double amount) {
        this.amount = amount;
        this.holder = holder;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Client :: " + "\nid: " + id + ", holder:" + holder + "; amount: " + amount + " |";
    }

}
