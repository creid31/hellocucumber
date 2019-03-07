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

    Animals executeGet(String url) throws IOException {
       return restTemplate.getForObject(url, Animals.class);
    }

    Animal executePost(String url, String type) throws IOException {
        HttpEntity<Animal> request = new HttpEntity<>(new Animal(type));
        return restTemplate.postForObject(url, request, Animal.class);
    }
}