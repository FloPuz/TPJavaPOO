import java.io.*;
import java.util.Scanner;

public class Exo_12_04_Matin {
    public void pyramideDroite(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }
    }

    public void pyramideSym(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                //D'abrod les espaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                //Ensuite les #
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void printSomme(int somme){
        //La formule pour la somme des n réels jusqu'à somme
        System.out.println(String.valueOf((somme*(somme+1))/2));
    }

    public void oddEvenPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        try {
            int number = Integer.parseInt(sc.nextLine());
            if (number%2 == 0) {
                System.out.println("C'est pair");
            } else if (number%2==1) {
                System.out.println("C'est impair");
            }
            boolean estPremier = true;
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    estPremier = false;
                    break;
                }
            }
            if (estPremier){
                System.out.println(number + " est un nombre premier.");
            }
            else {
                System.out.println(number + " n'est pas un nombre premier.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ce n'est pas un entier");
        }
    }

    public void jeuDuJusteNombre(int max,boolean indice){
        boolean win = false;
        int nbAlea = (int)(Math.random() * max);
        if(indice) {
            System.out.println("Le nombre a trouver c'est : " + nbAlea + " et c'est aussi de la triche");
        }
        int nbCoups = 0;
        while (!win){
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre :");
            try{
                int number = Integer.parseInt(sc.nextLine());
                nbCoups++;
                if (number==nbAlea){
                    win = true;
                    break;
                }
                if (number<nbAlea){
                    System.out.println("Plus grands");
                }else if (number>nbAlea){
                    System.out.println("Plus petit");
                }
            }catch (NumberFormatException e) {
                System.out.println("Ce n'est pas un entier");
            }
            System.out.println("Nombre de coups :"+nbCoups);
        }
        System.out.println("Bravo, gagné en "+nbCoups+" coups");
    }

    public void countNbWord(){
        //on fait l'entrer user dans la methode
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot pour compter ces lettres :");
        StringBuilder sb = new StringBuilder(sc.nextLine().trim());
        int j = 0;
        for(int i = 0; i < sb.length(); i++) {
            if (!Character.isWhitespace(sb.charAt(i))) {
                sb.setCharAt(j++, sb.charAt(i));
            }
        }
        sb.delete(j, sb.length());
        System.out.println("Il y a " + sb.length() + "lettres :");

    }

    /**
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public void saveInputIntoFile() throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir des trucs à enregistrer dans un txt :");
        StringBuilder sb = new StringBuilder(sc.nextLine().trim());
        PrintWriter writer = new PrintWriter("./target/test.txt", "UTF-8");
        writer.append(sb);
        writer.close();
    }

    public void readAndCountFromFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez renseigner le chemin pour aller lire le fichier :");
        StringBuilder sb = new StringBuilder(sc.nextLine().trim());
        try{
            File myObj = new File(sb.toString());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                StringBuilder data = new StringBuilder(myReader.nextLine());
                int j = 0;
                for(int i = 0; i < data.length(); i++) {
                    if (!Character.isWhitespace(data.charAt(i))) {
                        data.setCharAt(j++, data.charAt(i));
                    }
                }
                data.delete(j, data.length());
                System.out.println("Il y a " + data.length() + " lettres ");
            }

        }catch (Exception e){
            Exception exception = new Exception("Fichier introuvable");
            throw exception;
        }



    }

}

