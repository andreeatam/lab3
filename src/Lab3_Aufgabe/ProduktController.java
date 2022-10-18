package Lab3_Aufgabe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProduktController {

    //ex1
    public double Addieren(List<Produkt> liste_Produkte){
        double summe=0;
        for(Produkt p: liste_Produkte) {
            p.Rabatt();
            summe=summe+p.getBasisPreis(); //aici getBasisPreis e pretul dupa reducere, daca a indeplinit conditia de reducere
        }
        return summe;

    }

    //ex2
    public List<Produkt> ProdukteHoherAls100(List<Produkt>liste_Produkte){
        List<Produkt> returnedListe=new ArrayList<>();
        for(Produkt p: liste_Produkte){
            p.Rabatt();
            if(p.getBasisPreis()>100)
                returnedListe.add(p);
        }
        return returnedListe;
    }

    //ex3
    public void sortiert(List<Produkt> liste_Produkte) {
        for (Produkt p : liste_Produkte) {
            p.Rabatt();
        }
        Collections.sort(liste_Produkte, new Comparator<Produkt>() {
            @Override
            public int compare(Produkt o1, Produkt o2) {
                if(o1.getBasisPreis()<o2.getBasisPreis())
                    return 0;
                return 1;
            }
        });
    }

    //ex4
    public Produkt Teuerste_Produkt(List<Produkt> liste_Produkte){
        Produkt maxi = new Produkt(Float.MIN_VALUE,Integer.MIN_VALUE);
        for (Produkt p : liste_Produkte) {
            if(p.getBasisPreis()>maxi.getBasisPreis())
                maxi=p;
        }
        return maxi;
    }

    public Produkt Gunstigste_Produkt(List<Produkt> liste_Produkte){
        Produkt mini = new Produkt(Float.MAX_VALUE,Integer.MAX_VALUE);
        for (Produkt p : liste_Produkte) {
            if(p.getBasisPreis()>mini.getBasisPreis())
                mini=p;
        }
        return mini;
    }

}
