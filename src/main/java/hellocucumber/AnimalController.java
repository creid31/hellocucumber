package hellocucumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    private Animals animals;

    @RequestMapping(method={RequestMethod.GET},value={"/version"})
    public String getVersion() {
        return "1.0";
    }
}