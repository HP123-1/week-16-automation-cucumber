Feature: Finding a store on the 'Our Stores' page

  Scenario: Verify that user can drap the map to see a store from West Palm Beach
    Given User clicks on the link from the homepage "Our Stores"
    When User accepts the alert
    And moves the map to be able to view a store from West Palm Beach
    And scrolls the map for a clear view
    Then takes a screenshot for future reference
