package pl.edu.pjwstk.jazc.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int id;
    private int iloscPrzedzialow;
    private int aktualnaStacja;
    private List<Przedzial> przedzial;
    private List<Stacja> stacja;


    public Train() {
    }

    public Train(int id, int iloscPrzedzialow, int aktualnaStacja) {
        this.id = id;
        this.iloscPrzedzialow = iloscPrzedzialow;
        this.aktualnaStacja = aktualnaStacja;
        przedzial = new ArrayList<>();
        stacja = new ArrayList<>();

        for(int i=1;i<=iloscPrzedzialow;i++) {
            przedzial.add(new Przedzial(i,10));

        }

    }
    public void move(){
        this.aktualnaStacja++;
    }

    public List<Przedzial> getPrzedzial() {
        return przedzial;
    }

    public void setPrzedzial(List<Przedzial> przedzial) {
        this.przedzial = przedzial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public int getIloscPrzedzialow() {
        return iloscPrzedzialow;
    }

    public void setIloscPrzedzialow(int iloscPrzedzialow) {
        this.iloscPrzedzialow = iloscPrzedzialow;
    }

    public int getAktualnaStacja() {
        return aktualnaStacja;
    }

    public void setAktualnaStacja(int aktualnaStacja) {
        this.aktualnaStacja = aktualnaStacja;
    }
}
