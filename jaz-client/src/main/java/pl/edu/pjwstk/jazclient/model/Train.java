package pl.edu.pjwstk.jazclient.model;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int id;
    private int iloscPrzedzialow;
    private int aktualnaStacja;
    private String stacja;
    private List<Przedzial> przedzial;
    private boolean jedziedo;
    private  int iloscSiedzen;



    public Train() {
    }

    public Train(int id, int iloscPrzedzialow,int iloscSiedzen, int aktualnaStacja) {
        String[] nazwyStacji = {"Gdańsk główny", "Gdańsk Stocznia", "Gdańsk Politechnika", "Gdańsk Wrzeszcz", "Gdańsk Zaspa", "Gdańsk Przymorze", "Gdańsk Oliwa", "Gdańsk Żabianka",
                "Sopot Wyścigi", "Sopot", "Sopot Kamienny Potok", "Gdynia Orłowo", "Gdynia Redłowo", "Gdynia Wzgórze św. Maksymiliana", "Gdynia Główna"};

        this.id = id;
        this.iloscPrzedzialow = iloscPrzedzialow;
        this.aktualnaStacja = aktualnaStacja;
        this.stacja = nazwyStacji[aktualnaStacja];
        this.iloscSiedzen = iloscSiedzen;

        jedziedo=true;
        przedzial = new ArrayList<>();


        for(int i=1;i<=iloscPrzedzialow;i++) {
            przedzial.add(new Przedzial(i,iloscSiedzen));

        }




    }

    public int getAktualnaStacja() {
        return aktualnaStacja;
    }

    public void setAktualnaStacja(int aktualnaStacja) {
        this.aktualnaStacja = aktualnaStacja;
    }

    public String getStacja() {
        return stacja;
    }

    public void setStacja(String stacja) {
        this.stacja = stacja;
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


    public boolean isJedziedo() {
        return jedziedo;
    }

    public void setJedziedo(boolean jedziedo) {
        this.jedziedo = jedziedo;
    }

    public int getIloscPrzedzialow() {
        return iloscPrzedzialow;
    }

    public void setIloscPrzedzialow(int iloscPrzedzialow) {
        this.iloscPrzedzialow = iloscPrzedzialow;
    }


}
