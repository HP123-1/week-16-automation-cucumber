Feature: Test for deleting item from cart

  Scenario: As a user I want to delete an item from the basket and see basket is empty
    Given User selects Women "Women" tab from the main menu
    And Select Blouses "Summer Dresses" from the sub menu
    And Adds item to cart
    And closes shopping cart window
    And verify shopping cart has delete button
    And removes item from cart
    And verifies the banner display "Your shopping cart is empty."