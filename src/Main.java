import app.entities.User;
import app.repositories.UsersRepository;
import app.services.UserService;
import bank.Entities.BankAccount;
import bank.Entities.Client;
import bank.Services.BankService;
import forme.Rectangle;
import forme.Square;

import javax.swing.plaf.synth.SynthSeparatorUI;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Exo_12_04_Matin exo = new Exo_12_04_Matin();


    public static void main(String[] args) throws FileNotFoundException {
        //Pour l'instant on va tout faire dans la classe Main
        //Reverse string
        //StringBuilder stringToReverse = new StringBuilder("albert").reverse();
        //System.out.println(stringToReverse);
        //exo.pyramideDroite(10);
        //exo.pyramideSym(10);
        //exo.printSomme(10000);
        //exo.oddEvenPrime();
        //exo.jeuDuJusteNombre(1000,true);
        //exo.countNbWord();
        /*

        try {
            //exo.saveInputIntoFile();
            exo.readAndCountFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(5);
        rectangle.affiche();
        System.out.println(square.calculateSurface());
        System.out.println(rectangle.calculateSurface());
        Singleton singletonFOO = Singleton.getInstance("FOO");
        Singleton singletonBAR = Singleton.getInstance("BAR");
        System.out.println(singletonFOO.value);
        System.out.println(singletonBAR.value);


        BankService bs = new BankService();
        ArrayList<BankAccount> bankAccounts = bs.getAllBankAccount();

        for (BankAccount b :
                bankAccounts) {
            System.out.println(b.getNbAccount()+"_____________"+b.getAmount());
        }
        Client client1 = new Client("Toto","Tata");
        client1.addBankAccounts(bankAccounts.get(0));
        client1.addBankAccounts(bankAccounts.get(1));

        Client client2 = new Client("Titititi","Taratata");
        client2.addBankAccounts(bankAccounts.get(2));
        client2.addBankAccounts(bankAccounts.get(3));

        bs.transferMoney(client1.getSingleBankAccount(0),client2.getSingleBankAccount(0),99);
        //Je pourrais faire un menu en console pour faire ces opérations mais il y a pas d'interet à pousser ces notions de sysout et sysin à mon gout


        try
        {
            UsersRepository usersRepository = new UsersRepository();
            List<User> users = usersRepository.getAll();
            for (User user :
                    users) {
                System.out.println(user.getFirstname());
            }
            User user = usersRepository.getById(Long.valueOf(1));
            System.out.println(user.getFirstname());
            user.setFirstname("FlorentFlorentFlorent");
            user = usersRepository.updateUser(user);
            System.out.println(user.getFirstname());
            UserService userService = new UserService();

            //Je trouve ça bizarre de faire heriter un repo à un service mais ça me parait aussi cohérent de faire ça
            userService.getAll().stream().forEach(x -> System.out.println(x.getFirstname()));
            userService.exportUsers();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        */



    }


}