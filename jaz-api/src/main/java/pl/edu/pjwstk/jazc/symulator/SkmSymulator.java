package pl.edu.pjwstk.jazc.symulator;

import org.springframework.stereotype.Component;
import pl.edu.pjwstk.jazc.model.Osoba;
import pl.edu.pjwstk.jazc.model.Przedzial;
import pl.edu.pjwstk.jazc.model.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SkmSymulator {
    private List<Train> listTrain;
    private List<Train> listrTrainPom;
    private int aktualnaStacja;
    private List<Osoba> listPerson;
    private List<Przedzial> listPrzedzial;
    private List<Osoba> listaOsobZprzedzialu;
    public SkmSymulator(){

        listTrain = new ArrayList<>();

        for(int i=1;i<6;i++) {
            aktualnaStacja = ThreadLocalRandom.current().nextInt(0, 15 + 1);
            listTrain.add(new Train(i, i, aktualnaStacja));
        }
    }
    public void wsiadac(Train train){


        //for(Przedzial przedzial : train.getPrzedzial()){
        //    przedzial.getListaOsob().add(new Osoba("Adolf","Hitler",5));
        //}
        int IleWsiadaOsob = ThreadLocalRandom.current().nextInt(2, 8 + 1);
        for(int i=0;i<train.getIloscPrzedzialow();i++){
            listPrzedzial = train.getPrzedzial();
            Przedzial przedzial = listPrzedzial.get(i);
            przedzial.getListaOsob().add(new Osoba());
            listaOsobZprzedzialu = przedzial.getListaOsob();
            przedzial.setListaOsob(listaOsobZprzedzialu);

        }

    }

    public void move(){
        for(int i=0;i<listTrain.size();i++) {
            Train train = listTrain.get(i);
            if(train.isJedziedo()){
                if(train.getAktualnaStacja()<15){
                    train.setAktualnaStacja(train.getAktualnaStacja() + 1);
                        wsiadac(train);
                }else
                    train.setJedziedo(false);

            }else if(train.getAktualnaStacja()>0){
                train.setAktualnaStacja(train.getAktualnaStacja() - 1);

            }else
                train.setJedziedo(true);
        }

    }

    public List<Train> getListTrain() {
        return listTrain;
    }
    public List<Osoba> getListOsob() {
        return listaOsobZprzedzialu;
    }

}
