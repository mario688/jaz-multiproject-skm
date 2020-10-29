package pl.edu.pjwstk.jazclient.model;

import java.util.List;

public class Przedzial {
    private int idPrzedzialu;
    private int iloscMiejsc;
    private List<Osoba> iloscOsob;

    public Przedzial(int idPrzedzialu, int iloscMiejsc) {
        this.idPrzedzialu = idPrzedzialu;
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getIdPrzedzialu() {
        return idPrzedzialu;
    }

    public void setIdPrzedzialu(int idPrzedzialu) {
        this.idPrzedzialu = idPrzedzialu;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
}
