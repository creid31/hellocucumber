package hellocucumber;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AnimalController {
    private Animals animals = new Animals();

    @GetMapping("/animals")
    public Animals getAnimals() {
        return animals;
    }

    @PostMapping("/animals")
    public Animal createAnimal(@RequestBody Animal animal) {
        Map<String, Animal> list = animals.getAnimals();
        if (CollectionUtils.isEmpty(list)) {
            list = new HashMap<>();
        }
        list.put(animal.getType(), animal);
        animals.setCount(animals.getCount() + 1);
        animals.setAnimals(list);
        return animal;
    }

    @PostMapping("/animals/{type}")
    public Animal patchAnimal(@RequestBody Animal parent, @PathVariable String type) {
        Animal animal = animals.getAnimals().get(type);
        animal.setParentType(parent.getParentType());
        return animal;
    }

    @GetMapping("/animals/{type}")
    public Animal getAnimal(@PathVariable String type) {
        return animals.getAnimals().get(type);
    }

    @DeleteMapping("/animals")
    public void deleteAnimals(){
        animals.setAnimals(null);
        animals.setCount(0);
    }
}