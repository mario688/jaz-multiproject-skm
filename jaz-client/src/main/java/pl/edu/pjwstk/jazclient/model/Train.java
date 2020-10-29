package pl.edu.pjwstk.jazclient.model;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int id;
    private int numerPrzedzialu;
    private int iloscPrzedzialow;
    private String aktualnaStacja;
    private List<Przedzial> przedzial;
    private List<Stacja> stacja;

    public Train() {
    }

    public Train(int id, int numerPrzedzialu, int iloscPrzedzialow, String aktualnaStacja) {
        this.id = id;
        this.numerPrzedzialu = numerPrzedzialu;
        this.iloscPrzedzialow = iloscPrzedzialow;
        this.aktualnaStacja = aktualnaStacja;
        przedzial = new ArrayList<>();

        for(int i=1;i<=iloscPrzedzialow;i++) {
            przedzial.add(new Przedzial(numerPrzedzialu,10));
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerPrzedzialu() {
        return numerPrzedzialu;
    }

    public void setNumerPrzedzialu(int numerPrzedzialu) {
        this.numerPrzedzialu = numerPrzedzialu;
    }

    public int getIloscPrzedzialow() {
        return iloscPrzedzialow;
    }

    public void setIloscPrzedzialow(int iloscPrzedzialow) {
        this.iloscPrzedzialow = iloscPrzedzialow;
    }

    public String getAktualnaStacja() {
        return aktualnaStacja;
    }

    public void setAktualnaStacja(String aktualnaStacja) {
        this.aktualnaStacja = aktualnaStacja;
    }
}
