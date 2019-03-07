package hellocucumber;

import lombok.Data;

import java.util.List;

@Data
public class Animals {
    List<Animal> animals;

    int count;
}
