package pl.edu.pjwstk.jazc.model;

import java.util.ArrayList;
import java.util.List;

public class Przedzial {
    private int idPrzedzialu;
    private int iloscMiejsc;
    private int iloscMiejscNaStarcie;
    private float procentoweZapełnieniePrzedzialu;

    private List<Osoba> listaOsob = new ArrayList<>();

    public Przedzial() {
    }

    public Przedzial(int idPrzedzialu, int iloscMiejsc) {
        this.idPrzedzialu = idPrzedzialu;
        this.iloscMiejsc = iloscMiejsc;
        this.iloscMiejscNaStarcie = iloscMiejsc;


    }

    public float getProcentoweZapełnieniePrzedzialu() {
        return procentoweZapełnieniePrzedzialu;
    }

    public void setProcentoweZapełnieniePrzedzialu(float procentoweZapełnieniePrzedzialu) {
        this.procentoweZapełnieniePrzedzialu = procentoweZapełnieniePrzedzialu;
    }

    public int getIloscMiejscNaStarcie() {
        return iloscMiejscNaStarcie;
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
