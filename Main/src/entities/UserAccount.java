package entities;

import java.time.LocalDate;

public class UserAccount extends Account{
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private int age;

    public UserAccount(String password, String name, String cpf, LocalDate birthDate, int age) {
        super(password);
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "\nUser data: " +
                "\nName: " + name +
                "\nCPF: " + cpf +
                "\nAge: " + age +
                "\nBirth year: " + birthDate +
                "\nPassword: " + password;
    }

    @Override
    public String getDocument() {
        return cpf;
    }

    @Override
    public String getDisplayName() {
        return name;
    }
}
