package hellocucumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@ContextConfiguration(
        classes = DemoApplication.class, loader = SpringBootContextLoader.class)
@WebAppConfiguration
public class SpringIntegrationTest {


    @Autowired
    protected RestTemplate restTemplate;

    private String url = "http://localhost:8080/animals";

    Animals executeGet() throws IOException {
       return restTemplate.getForObject(url, Animals.class);
    }

    Animal executeGet(String type) throws IOException {
        return restTemplate.getForObject(url + "/" + type, Animal.class);
    }

    Animal executePost(String type) throws IOException {
        Animal animal = new Animal();
        animal.setType(type);
        HttpEntity<Animal> request = new HttpEntity<>(animal);
        return restTemplate.postForObject(url, request, Animal.class);
    }

    void executeDelete() throws IOException {
        restTemplate.delete(url);
    }

    Animal executePatch(String type, Animal parent){
        HttpEntity<Animal> request = new HttpEntity<>(parent);
        return restTemplate.postForObject(url +"/" + type, request, Animal.class);
    }
}