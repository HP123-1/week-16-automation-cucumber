package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.OurStoresPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreFinderSteps {
    @Given("^User clicks on the link from the homepage \"([^\"]*)\"$")
    public void userClicksOnTheLinkFromTheHomepage(String link) {
        new HomePage().selectFromInformationFooter(link);
    }

    @When("^User accepts the alert$")
    public void userAcceptsTheAlert() {
        new OurStoresPage().acceptTheGooglePopUpAlert();
    }

    @And("^moves the map to be able to view a store from West Palm Beach$")
    public void movesTheMapToBeAbleToViewAStoreFromWestPalmBeach() {
        new OurStoresPage().scrollMapToSeeWestPalmBeach();
    }

    @And("^scrolls the map for a clear view$")
    public void scrollsTheMapForAClearView() {
        new OurStoresPage().scrollPageDown();
    }

    @Then("^takes a screenshot for future reference$")
    public void takesAScreenshotForFutureReference() {
        new OurStoresPage().takeScreenshot();
    }
}
