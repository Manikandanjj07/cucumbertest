@Mobile
Feature: Mobile Validation Feature
 #  I want to use this template for my feature file


  Scenario: Mobile Validation Scenario
    Given lauching Flipkart
    And login "9842642468", "Prajinkuti"
    When search mobile "iPhone"
    And click first product
    And window handles 
    Then browser close
   

