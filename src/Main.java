import forme.Rectangle;
import forme.Square;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    private static Exo_12_04_Matin exo = new Exo_12_04_Matin();


    public static void main(String[] args)
    {
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
        /*try {
            //exo.saveInputIntoFile();
            exo.readAndCountFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(5);
        rectangle.affiche();
        System.out.println(square.calculateSurface());
        System.out.println(rectangle.calculateSurface());


    }


}