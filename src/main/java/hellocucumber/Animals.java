package hellocucumber;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Animals implements Serializable {
    List<Animal> animals;

    int count;
}
