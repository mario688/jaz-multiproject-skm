package pl.edu.pjwstk.jazc.model;

import java.util.ArrayList;
import java.util.List;

public class Przedzial {
    private int idPrzedzialu;
    private int iloscMiejsc;
    private List<Osoba> listaOsob = new ArrayList<>();
    public Przedzial() {
    }

    public Przedzial(int idPrzedzialu, int iloscMiejsc) {
        this.idPrzedzialu = idPrzedzialu;
        this.iloscMiejsc = iloscMiejsc;


    }




    public List<Osoba> getListaOsob() {
        return listaOsob;
    }

    public void setListaOsob(List<Osoba> listaOsob) {
        this.listaOsob = listaOsob;
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
