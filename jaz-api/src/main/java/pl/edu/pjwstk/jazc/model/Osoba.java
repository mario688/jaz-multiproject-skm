package pl.edu.pjwstk.jazc.model;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int bilet;

    public Osoba() {
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
