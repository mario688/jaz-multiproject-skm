package pl.edu.pjwstk.jazc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjwstk.jazc.model.Osoba;
import pl.edu.pjwstk.jazc.model.Przedzial;
import pl.edu.pjwstk.jazc.model.Stacja;
import pl.edu.pjwstk.jazc.model.Train;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class SkmController {

    private List<Train> listTrain;
    private List<Stacja> stacja;


    Train train = new Train(222, 10, 2);
    Train train2 = new Train(200, 50, 3);
    Train train3 = new Train(201, 11, 5);

    public SkmController() {

        stacja = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            stacja.add(new Stacja(i));
        }
        listTrain = new ArrayList<>();

        listTrain.add(train);
        listTrain.add(train2);
        listTrain.add(train3);
    }
    @GetMapping("/pociagi")
    public List<Train> getTrains() {

        return listTrain;

    }


    @GetMapping
    public Train getById(@RequestParam int id) {
        Optional<Train> first = listTrain.stream().filter(element -> element.getId() == id).findFirst();
        return first.get();
    }


    @GetMapping("/doprzodu")
    public List<Train> doprzodu() {
        train.move();
        train2.move();
        train3.move();
        return listTrain;

    }


/*




*/


}
