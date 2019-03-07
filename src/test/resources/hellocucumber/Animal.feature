@all
Feature: animals are created

  Scenario: a tiger is created
    Given 0 animals exist
    When I create a tiger
    Then animal of type tiger is created
    And 1 animals exist


  Scenario: a tiger's parent is updated
    Given an animal of type tiger exists
    When I create lion as a parent
    And I update the tiger to have that parent
    Then the tiger is updated