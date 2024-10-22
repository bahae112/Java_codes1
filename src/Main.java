//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //exercice 1
        System.out.println("---------------------------------Exercice 1--------------------------------------------");
        Point p1 = new Point(10,10);
        Point p2 = new Point(20,20);
        // pour determiner le plus loin par une methode statique
        Point p = Point.plusLoin(p1,p2);
        // pour deteminer le plus loin par rapport a l'objet courant
        Point p3 = new Point(30,30);
        p3.plusLoin(p2);
        // methode de déplacement
        p1.deplacer(2,2);
        //exercice 2
        System.out.println("--------------------------------Exercice 2---------------------------------------");
        Segment s = new Segment(p1,p2);
        s.deplacerExtremite(2,2);
        s.deplacerOrigine(2,2);
        // Exercice 3
        System.out.println("----------------------------------Exercice 3--------------------------------------------------");
        double[] myTab = {1.0, 2.0, 3.0};
        UtilTab util = new UtilTab(myTab);
        System.out.println("Somme: " + util.somme());
        util.incre(10);
        for(int i = 0; i < myTab.length; i++){
            System.out.println("l'élement d'indice" + " " + i +" s'est incrementé : " +myTab[i]);
        }
        // la fonction qui genere les nombres impairs d'un tableau
        double [] tab = util.genere(3);
        for(int i = 0; i < tab.length; i++){
            System.out.println("les nombres impairs aprés l'incrementation des valeurs de tab sont :" + tab[i]);
        }
        // somme de deux vecteurs :
        //EXERCICE  4
        System.out.println("----------------------------------Exercice 4--------------------------------------------------");

        Vector<Integer> vecteur1 = new Vector<>();  // pour declarer les vecteurs
        Vector<Integer> vecteur2 = new Vector<>();  // pour declarer les vecteurs
        vecteur1.add(1);
        vecteur1.add(2);
        vecteur1.add(3);
        vecteur2.add(4);
        vecteur2.add(5);
        vecteur2.add(6);
        Vector<Integer> somme = UtilTab.somme2(vecteur1 , vecteur2);
        System.out.println("Somme des deux vecteurs: " + somme);
        //exercice 5
        System.out.println("----------------------------------Exercice 5--------------------------------------------------");
        // manipulation des vecteurs à l'aide de la classe vecteur
        double[] tableau = {1,2,3,4,56,7};
        double[] tableau2 = {13,15,18,17,4,3};
        Vecteur v1 = new Vecteur(tableau);
        Vecteur v2 = new Vecteur(tableau2);
        v1.afficher();
        Vecteur sum = Vecteur.somme(v1,v2);
        System.out.println("La somme des deux vecteurs c'est : ------------------------" );
        sum.afficher();
        // les chaines de caracteres  manipulation et operations :::
        String ch = "bonjour\tmonsieur" ;
        System.out.println (ch) ;
        char[] tableau0 = {1,2,3,4,5,6};
        Vector<Character> vect11 = new Vector<>();
        vect11.add('a');
        for( int i =0 ; i < tableau0.length; i++){
            System.out.println(tableau[i]);
        }
        System.out.println(ch.charAt(0));  // it shows the caracter at position index 0 ..
        // indexOf and lastindexOf
        String mot = "anticonstitutionnellement" ;
        int n ;
        n = mot.indexOf ('t') ; // n vaut 2
        n = mot.lastIndexOf ('t') ; // n vaut 24
        //   la classe chaineTest
        ChaineTest tst = new ChaineTest("bahaeddine");
        tst.longchaine();
}

}