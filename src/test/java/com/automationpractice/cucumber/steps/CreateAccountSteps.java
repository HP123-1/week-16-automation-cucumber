package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.AuthenticationPage;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class CreateAccountSteps {
    @When("^User clicks on the sign in button from the homepage$")
    public void userClicksOnTheSignInButtonFromTheHomepage() {

        new HomePage().clickOnSignInButton();
    }


    @And("^enters an email in the email address field$")
    public void entersAnEmailInTheEmailAddressField() {
        new AuthenticationPage().enterRandomEmailInTheEmailAddressField();
    }

    @And("^clicks on create an account tab$")
    public void clicksOnCreateAnAccountTab() {
        new AuthenticationPage().clickOnCreateAnAccountTab();


    }

    @And("^fill all mandatory fields$")
    public void fillAllMandatoryFields(DataTable dataTable) {
        List<List<String>> userDetails = dataTable.asLists(String.class);
        for (List<String> e : userDetails) {
            new CreateAccountPage().fillMandatoryFields(e.get(0), e.get(1), e.get(2), e.get(3), e.get(4), e.get(5), e.get(6), e.get(7));
        }


    }

    @And("^click on register$")
    public void clickOnRegister() {
        new CreateAccountPage().clickOnRegister();
    }

    @And("^verify my account text \"([^\"]*)\"$")
    public void verifyMyAccountText(String text) {
        // Write code here that turns the phrase above into concrete actions
        new CreateAccountPage().verifyMyAccountText(text);
    }

    @Then("^verify user can see his name on top right \"([^\"]*)\"$")
    public void verifyUserCanSeeHisNameOnTopRight(String name) {
        // Write code here that turns the phrase above into concrete actions
        new MyAccountPage().verifyUserCanSeeAccountNameOnTopRight(name);
    }

    @And("^verify that invalid information will give an error message \"([^\"]*)\"$")
    public void verifyThatInvalidInformationWillGiveAnErrorMessage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        new CreateAccountPage().verifyErrorMessage(message);
    }
}
