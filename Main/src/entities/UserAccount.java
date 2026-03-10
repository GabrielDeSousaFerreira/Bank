package entities;

public class UserAccount {
    private String name;
    private String cpf;
    private String email;
    private int age;
    private String password;
    private double balance;

    public UserAccount(String name, String cpf, String email, int age, String password) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.age = age;
        this.password = password;
        this.balance = 0.0;
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
