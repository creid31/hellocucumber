package hellocucumber;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class Stepdefs extends SpringIntegrationTest {
    private Animals animals;

    private Animal animal;

    private Animal parent;

    private int count;

    @Given("^(\\d+) animals exist$")
    public void animals_exist(int count) throws Throwable {
        animals = executeGet();
        assertEquals("Number of animals should match", count, animals.getCount());

    }

    @Given("^I update the (.*) to have that parent$")
    public void update_parent(String child) throws Throwable {
        animal = executePatch(child, parent);
    }

    @Given("^an animal of type (.*) exists$")
    public void specific_animal_exists(String type) throws Throwable {
        create_animal(type);
    }

    @Given("^I create (.*) as a parent")
    public void create_parent(String parentType) throws Throwable {
        parent = executePost(parentType);
    }

    @When("^I create a (.*)$")
    public void create_animal(String type) throws Throwable {
        animal = executePost(type);
    }

    @Then("^the (.*) is updated$")
    public void animal_is_updated(String type) throws Throwable {
        Animal currAnimal = executeGet(type);
        assertEquals("Parent should be updated", animal.getParentType(), currAnimal.getParentType());
    }

    @Then("^animal of type (.*) is created$")
    public void assert_animal_creation(String type) {
        assertEquals("Type of created animal should match", type, animal.getType());
    }

    @After("@all")
    public void clearAnimals() throws Throwable {
        executeDelete();
    }

}