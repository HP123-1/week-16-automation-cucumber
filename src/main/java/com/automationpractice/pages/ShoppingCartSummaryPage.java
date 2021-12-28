package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartSummaryPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartSummaryPage.class.getName());


    public ShoppingCartSummaryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement emptyShoppingCartVerificationText;

    public void verifyShoppingCartIsEmptyMessage(String message){
        log.info("verifying empty cart message : " + emptyShoppingCartVerificationText.toString() + "<br>");
        pmClickOnElement(cartButton);
        pmVerifyElements("Incorrect Message", message, emptyShoppingCartVerificationText);
    }
}
