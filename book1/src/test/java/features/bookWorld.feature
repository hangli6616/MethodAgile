#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Quotation for a book
  A customer would like to know the price of a book in a bookstore.

  @tag1
  Scenario: Quotation for a book in a bookstore
    Given a <bookstore>
    When customer ask for the price
    Then give <name>
    And give <price>
    
    Examples: 
      | bookstore      |         name          | price |
      | "Galiggnani"   |   "Le Petit prince"   |  7.9  |
      | "Gibert Jeune" |  "Notre-Dame de Paris"|  14   |
      
      
