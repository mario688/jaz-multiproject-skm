package pl.edu.pjwstk.jazclient.symulator;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pl.edu.pjwstk.jazclient.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Configuration
@EnableConfigurationProperties(SkmSettings.class)

public class SkmSymulator {
    private List<Train> listTrain;

    private int aktualnaStacja;

    private List<Przedzial> listPrzedzial;

    int IleWsiadaOsob;


    public SkmSymulator(){
        SkmSettings skmSettings = new SkmSettings();
        listTrain = new ArrayList<>();
        int trains = skmSettings.getTrains();
        int compartments = skmSettings.getCompartments();
        int seats = skmSettings.getSeats();
        if(trains==0||compartments==0||seats==0){
            trains=10;
            compartments=5;
            seats=10;
        }

        for(int i=1;i<trains;i++) {
            aktualnaStacja = ThreadLocalRandom.current().nextInt(0, 14 + 1);
            listTrain.add(new Train(i,compartments,seats, aktualnaStacja));
        }
    }
    public void wsiadac(Train train) {


        IleWsiadaOsob = ThreadLocalRandom.current().nextInt(2, 8 + 1);
        for (int i = 0; i < train.getIloscPrzedzialow(); i++) {
            listPrzedzial = train.getPrzedzial();
            Przedzial przedzial = listPrzedzial.get(i);
            int iloscMiejsc = przedzial.getIloscMiejsc();


            if (iloscMiejsc > IleWsiadaOsob || iloscMiejsc != 0) {

                for (int o = 0; o < iloscMiejsc; o++) {
                    int randStation = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    if (randStation > train.getAktualnaStacja() && train.isJedziedo() || randStation < train.getAktualnaStacja() && !train.isJedziedo()) {
                        Osoba person = new Osoba(randStation);
                        przedzial.getListaOsob().add(person);
                        iloscMiejsc = przedzial.getIloscMiejsc();
                        iloscMiejsc--;
                        przedzial.setIloscMiejsc(iloscMiejsc);
                    }

                }

            }

        }


    }

    void wysiadanie(Train train){
        for (int i = 0; i < train.getIloscPrzedzialow(); i++) {
            listPrzedzial = train.getPrzedzial();
            Przedzial przedzial = listPrzedzial.get(i);
            List<Osoba> ListaOsob;
            ListaOsob = przedzial.getListaOsob().stream().filter(osoba -> osoba.getBilet() != train.getAktualnaStacja()).collect(Collectors.toList());
            przedzial.setListaOsob(ListaOsob);

            int AktualnaIloscMiejsc = ListaOsob.size();

            przedzial.setIloscMiejsc(przedzial.getIloscMiejscNaStarcie()-AktualnaIloscMiejsc);


            float iloscMiejsc = przedzial.getIloscMiejsc();
            float iloscMiejscNaStarcie = przedzial.getIloscMiejscNaStarcie();
            float procent = Math.round((iloscMiejsc/iloscMiejscNaStarcie)*100);

            przedzial.setProcentoweZapełnieniePrzedzialu(procent);

        }

    }

    public void move(){
        for(int i=0;i<listTrain.size();i++) {
            Train train = listTrain.get(i);
            if(train.isJedziedo()){
                if(train.getAktualnaStacja()<15){
                    train.setAktualnaStacja(train.getAktualnaStacja() + 1);
                        wsiadac(train);
                        wysiadanie(train);
                }else
                    train.setJedziedo(false);

            }else if(train.getAktualnaStacja()>0){
                train.setAktualnaStacja(train.getAktualnaStacja() - 1);
                wsiadac(train);
                wysiadanie(train);
            }else
                train.setJedziedo(true);
        }


    }

    public List<Train> getListTrain() {
        return listTrain;
    }
    public Train getListTrainById(int Id){
        Train train = new Train();

        for(int i=0;i<listTrain.size();i++){
            Train trains = listTrain.get(i);
            if(trains.getId()==Id){
                train = trains;
            }

        }

        return train;
    }






}
