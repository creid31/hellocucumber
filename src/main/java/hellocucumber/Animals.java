package hellocucumber;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class Animals implements Serializable {
    private Map<String, Animal> animals;

    private int count;
}
