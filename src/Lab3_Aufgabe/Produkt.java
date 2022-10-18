package Lab3_Aufgabe;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.List;
import java.util.*;
import java.util.Comparator;

public class Produkt {

    private float basisPreis;
    private int anzahlTage;

    public Produkt(float preis,int tage){
        this.basisPreis=preis;
        this.anzahlTage=tage;
        if(preis % 0.05!=0)
            preis-=preis % 0.05;
    }

    public double getBasisPreis() {
        return basisPreis;
    }

    public void setBasisPreis(float basisPreis) {
        this.basisPreis = basisPreis;
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }


    public void Rabatt(){
        if(this.anzahlTage>10 && this.anzahlTage<=20)
            this.basisPreis=this.basisPreis-this.basisPreis*10/100;
        else if(this.anzahlTage>20)
               this.basisPreis=this.basisPreis-this.basisPreis*20/100;
    }
}

