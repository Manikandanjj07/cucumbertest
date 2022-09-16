@TV
Feature: TV Validation Feature
  I want to use this template for my feature file

  Background: 
    Given Flipkart launch
    And sigin "9842642468", "aa"

  Scenario: Tv-1 Validation scenario
    When Searching Tv "realme"
    And clicking tv
    And Window Handling
    Then browser closee

  Scenario: Tv-2 Validation scenario
    When Searching Tv with oneD list
      | Mi | LG | SAMSUNG |
    And clicking tv
    And Window Handling
    Then browser closee

  
  Scenario: Tv-3 Validation scenario
    When Searching Tv with oneD map
      | 1 | Nokia   |
      | 2 | OnePlus |
      | 3 | Intex   |
    And clicking tv
    And Window Handling
    Then browser closee

  Scenario Outline: TV-4 Validation scenario
    When Searching Tv "<TV>"
    And clicking tv
    And Window Handling
    Then browser closee

    Examples: 
      | TV     |
      | TCL    |
      | Vu     |
      | Coocaa |
