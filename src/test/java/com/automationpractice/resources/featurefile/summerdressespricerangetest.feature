Feature: Changing price range

  Scenario: User should be able to update the price range for the filter options
    Given User selects Women "Women" tab from the main menu
    When Select Blouses "Summer Dresses" from the sub menu
    And verifies the "SUMMER DRESSES " page verification text
    Then moves the slider to change the price range