package pl.edu.pjwstk.jazc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pl.edu.pjwstk.jazc.model.Train;
import pl.edu.pjwstk.jazc.symulator.SkmSymulator;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SkmController {

    private SkmSymulator listTrain = new SkmSymulator();


    public SkmController() {


    }

    @GetMapping("/pociagi")
    public List<Train> getTrains() {

        return listTrain.getListTrain();

    }

    @GetMapping("/doprzodu")
    public List<Train> doPrzodu() {

        listTrain.move();
        return listTrain.getListTrain();

    }

    @GetMapping("/pociagi/{IdTrain}")
    public Train getTrain(@PathVariable("IdTrain") Integer train) {

        return listTrain.getListTrainById(train);


    }






/*
    @GetMapping
    public Train getById(@RequestParam int id) {
        Optional<Train> first = listTrain.stream().filter(element -> element.getId() == id).findFirst();
        return first.get();
    }


    @GetMapping("/doprzodu")
    public List<Train> doprzodu() {


    }
    public void move(){
        for(Train train:listTrain){
            train.getAktualnaStacja();
        }
    }

*/


}
