package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class Stepdefs extends SpringIntegrationTest {
    private Animals animals;

    private Animal animal;

    @Given("^(\\d+) animals exist$")
    public void animals_exist(int count) throws Throwable {
        animals = executeGet("http://localhost:8080/animals");
        assertEquals("Number of animals should match", count, animals.count);

    }

    @When("^I create a (.*)$")
    public void animal_created(String type) throws Throwable {
        animal = executePost("http://localhost:8080/animals", type);
    }

    @Given("^(\\d+) animal exists of type (.*)$")
    public void assert_animal_exists(int count, String type) throws Throwable {
        animals = executeGet("http://localhost:8080/animals");
        assertEquals("Number of animals should match", count, animals.count);
        assertEquals("Type of existing animal should match", type, animals.getAnimals().get(0));
    }

    @Then("^animal of type (.*) is created$")
    public void assert_animal_creation(String type){
        assertEquals("Type of created animal should match", type, animal.getType());
    }
}