package bank.Services;

import bank.Entities.BankAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Pas foufou comme ça mais il faudrait un repo pour avoir un peu plus de matière, pour l'exo je me limite au transfert de fonds
public class BankService {

    public void transferMoney(BankAccount accountFrom ,BankAccount accountTo,double amount){
        if (accountFrom.getAmount() < amount) {
            System.out.println("Vous n'avez pas les fonds");
        }else {
            accountFrom.setAmount(accountFrom.getAmount()-amount);
            accountTo.setAmount(accountTo.getAmount()+amount);
            System.out.println(String.valueOf(amount)+" € transferer du compte "+accountFrom.getNbAccount() + " au compte "+accountTo.getNbAccount());
        }
    }

    public ArrayList<BankAccount>getAllBankAccount() throws FileNotFoundException {
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        Scanner sc = new Scanner(new File("./ressources/bankaccount.csv"));
        sc.useDelimiter("\\r");//Retour chariot
        while (sc.hasNext())
        {
            String dataLine = sc.next();
            String[] data = dataLine.split(";",2);
            bankAccounts.add(new BankAccount(Integer.valueOf(data[0].trim()),Double.parseDouble(data[1].trim())));
        }
        sc.close();
        return bankAccounts;
    }

}
