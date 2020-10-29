package pl.edu.pjwstk.jazclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.edu.pjwstk.jazclient.model.Train;

import java.util.Arrays;
import java.util.List;

@RestController
public class TrainScheduleController {
    private final String URI = "http://jazapi:11111/pociagi";

    @GetMapping("/readTrain")
    public List<Train> getCatalogue(){

        RestTemplate template = new RestTemplate();

        Train[] dataTrain = template.getForObject(URI, Train[].class);


        return Arrays.asList(dataTrain);
    }


}
