package hellocucumber;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Animal implements Serializable {
    String type;
}
