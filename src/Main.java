import Lab3_Aufgabe.Produkt;
import Lab3_Aufgabe.ProduktController;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProduktController controller=new ProduktController();

        Produkt p1=new Produkt(55,1);
        Produkt p2=new Produkt(28,12);
        Produkt p3=new Produkt(120,25);
        Produkt p4=new Produkt(17,3);
        Produkt p5=new Produkt(60,14);
        Produkt p6=new Produkt(50,10);

       List<Produkt>liste_Produkte=new LinkedList<Produkt>();
       liste_Produkte.add(p1);
       liste_Produkte.add(p2);
       liste_Produkte.add(p3);
       liste_Produkte.add(p4);
       liste_Produkte.add(p5);
       liste_Produkte.add(p6);

       System.out.println("Die Summe aller Preise nach dem Rabatt ist " + controller.Addieren(liste_Produkte));

       Produkt prodMax=controller.Teuerste_Produkt(liste_Produkte);
       System.out.println("Das teuerste Produkt ist - "+ "Preis: " + prodMax.getBasisPreis() + ", Anzahl Tage: " + prodMax.getAnzahlTage());

       Produkt prodMin=controller.Gunstigste_Produkt(liste_Produkte);
       System.out.println("Das gunstigste Produkt ist - "+ "Preis: " + prodMin.getBasisPreis() + ", Anzahl Tage: " + prodMax.getAnzahlTage());


        

    }
}