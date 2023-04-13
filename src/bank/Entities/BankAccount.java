package bank.Entities;

public class BankAccount {

    private int nbAccount;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNbAccount() {
        return nbAccount;
    }

    public BankAccount() {
        this.nbAccount = (int)Math.random()*1000000;
        this.amount = 0;
    }
    public BankAccount(double amount) {
        this.nbAccount =  (int)Math.random()*1000000;
        this.amount = amount;
    }

    public BankAccount(int nbAccount, double amount) {
        this.nbAccount = nbAccount;
        this.amount = amount;
    }
}
