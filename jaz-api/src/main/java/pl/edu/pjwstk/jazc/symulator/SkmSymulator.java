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
    int IleWsiadaOsob;
    public SkmSymulator(){

        listTrain = new ArrayList<>();

        for(int i=1;i<6;i++) {
            aktualnaStacja = ThreadLocalRandom.current().nextInt(0, 15 + 1);
            listTrain.add(new Train(i, i, aktualnaStacja));
        }
    }
    public void wsiadac(Train train) {


         IleWsiadaOsob = ThreadLocalRandom.current().nextInt(2, 8 + 1);
            for (int i = 0; i < train.getIloscPrzedzialow(); i++) {
                listPrzedzial = train.getPrzedzial();
                Przedzial przedzial = listPrzedzial.get(i);
                int iloscMiejsc;
                for (int o = 0; o < IleWsiadaOsob; o++) {
                    int randStation = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    Osoba person = new Osoba(randStation);
                    przedzial.getListaOsob().add(person);
                        iloscMiejsc = przedzial.getIloscMiejsc();
                        iloscMiejsc--;
                        przedzial.setIloscMiejsc(iloscMiejsc);

                    }
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



}
