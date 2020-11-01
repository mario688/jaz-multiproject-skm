package pl.edu.pjwstk.jazclient.model;

import java.util.concurrent.ThreadLocalRandom;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int bilet;


    public Osoba(int bilet) {
        String[] Names = {"Adam","Karol","Henio","Mario","Krzysztof","Bartek","Kuba","Monika","Maja","Kasia"};
        String[] Surnames = {"Gliwa","Wojtyla","Nowak","Kowalski","Gorski","Formela","Karszny","Pioch","Taube","Maciejewski"};

        int RandName = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        int RandSurnames = ThreadLocalRandom.current().nextInt(0, 9 + 1);

       this.imie=Names[RandName];
       this.nazwisko=Surnames[RandSurnames];
       this.bilet=bilet;

    }

    public Osoba(String imie, String nazwisko, int bilet) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.bilet = bilet;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getBilet() {
        return bilet;
    }

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }
}
