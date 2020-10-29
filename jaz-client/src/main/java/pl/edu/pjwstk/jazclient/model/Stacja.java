package pl.edu.pjwstk.jazclient.model;

import java.util.Arrays;
import java.util.List;

public class Stacja {
    private List<String> nazwaStacji = Arrays.asList( "alex", "brian", "charles");;

    public List<String> getNazwaStacji() {
        return nazwaStacji;
    }

    public void setNazwaStacji(List<String> nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
    }
}
