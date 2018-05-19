Feature: Working with a Stack
  As a person
  I want to browse item on the website
  So that I can purchase the items I want

  Scenario: Explore the items ont the website
    Given the web address
    When I navigate to the Menu page
    Then I can choose the item in a list of available teas products

  Scenario: Write your data in all textfields
    Given the web address
    When I navigate to the Let's Talk Tea page
    Then I can write data in to all textfields

  Scenario: Access to the Our Passion Page
    Given the web address
    When I click on Our Passion button
    Then I can see the Our Passion webpage