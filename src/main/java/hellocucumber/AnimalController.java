package hellocucumber;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {
    private Animals animals = new Animals();

    @GetMapping("/animals")
    public Animals getAnimals() {
        return animals;
    }

//    @PostMapping("/animals")
//    public Animal createAnimal(@RequestBody Animal animal) {
//        List<Animal> list = animals.getAnimals();
//        if (CollectionUtils.isEmpty(list)) {
//            list = new ArrayList<>();
//        }
//        list.add(animal);
//        animals.count += 1;
//        animals.setAnimals(list);
//        return animal;
//    }
}