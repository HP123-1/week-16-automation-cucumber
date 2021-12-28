package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (css = "a[title='View my customer account'] span")
    WebElement accountNameVerification;

    public void verifyUserCanSeeAccountNameOnTopRight(String expectedName){
        log.info("verify the account name : " + accountNameVerification.toString());
        pmVerifyElements("Incorrect Account", expectedName, accountNameVerification);
    }
}
