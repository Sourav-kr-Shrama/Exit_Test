
Feature: To Test The Search Option
  I want to use this template for my feature file
@tag
  Scenario Outline: Search Option
    Given user open the App
    When user clicks on the  view option
    And Scrolls the page
    And click on the search View button and on Action bar option
    Then click on search icon
    And enter the user in step <user>

    Examples: 
      | user  |
      | apple |
