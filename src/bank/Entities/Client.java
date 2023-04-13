package bank.Entities;

import java.util.ArrayList;

public class Client {

    private String name;
    private String firstname;

    private ArrayList<BankAccount> bankAccounts;

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public BankAccount getSingleBankAccount(int i) {
        return bankAccounts.get(i);
    }

    public void addBankAccounts(BankAccount bankAccounts) {
        this.bankAccounts.add(bankAccounts);
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Client() {
    }

    public Client(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
        this.bankAccounts = new ArrayList<BankAccount>();
    }
}
