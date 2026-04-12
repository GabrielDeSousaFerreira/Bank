package entities;

public abstract class Account {
    protected String password;
    protected double balance;

    public Account(String password) {
        this.password = password;
        this.balance = 0.0;
    }

    public abstract String getDocument();
    public abstract String getDisplayName();

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }
}
