package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.Then;

public class SummerDressSteps {
    @Then("^verifies the \"([^\"]*)\" page verification text$")
    public void verifiesThePageVerificationText(String verificationText)  {
        new SummerDressesPage().verifySummerDressesPageVerificationText(verificationText);
    }
}
