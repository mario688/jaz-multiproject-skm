package pl.edu.pjwstk.jazclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.edu.pjwstk.jazclient.model.Train;
import pl.edu.pjwstk.jazclient.symulator.SkmSymulator;

import java.util.Arrays;
import java.util.List;

@RestController
public class TrainScheduleController {
    private SkmSymulator listTrain = new SkmSymulator();

    @GetMapping("/Readpociagi")
    public List<Train> getTrains() {

        return listTrain.getListTrain();

    }
    @GetMapping("/Readpociagi/{IdTrain}")
    public Train getTrain(@PathVariable("IdTrain") Integer train) {

        return listTrain.getListTrainById(train);


    }





}
