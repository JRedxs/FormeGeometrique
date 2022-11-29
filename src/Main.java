import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       FormeConteneur conteneur = new FormeConteneur(null);
       Carre f = new Carre("ABCD" , 4 );
       Cercle c = new Cercle("CercleConteneur", 3);
       conteneur.addForme(f);
       conteneur.addForme(c);

       System.out.println(conteneur.toString());




    }
}