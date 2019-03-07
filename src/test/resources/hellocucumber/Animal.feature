Feature: animals are created

  Scenario: a tiger is created
    Given 0 animals exist
    When I create a tiger
    Then animal of type tiger is created
    And 1 animals exist

  Scenario: a tiger is not created
    Given 1 animal exists of type rabbit
    When I create a tiger
    Then animal of type tiger is created