package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ShoppingCartPage;
import com.automationpractice.pages.ShoppingCartSummaryPage;
import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DeletationTestSteps {

    @Given("^User selects Women \"([^\"]*)\" tab from the main menu$")
    public void userSelectsWomenTabFromTheMainMenu(String menu) {
        new HomePage().selectItemFromMainMenu(menu);

    }

    @And("^Select Blouses \"([^\"]*)\" from the sub menu$")
    public void selectBlousesFromTheSubMenu(String subMenu) {
        new HomePage().selectItemsFromWomensMenu(subMenu);
    }

    @And("^Adds item to cart$")
    public void addsItemToCart() {
        new SummerDressesPage().addPrintedChiffonDressToCart();
    }

    @And("^closes shopping cart window$")
    public void closesShoppingCartWindow() {
        new ShoppingCartPage().closeShoppingCartWindow();
    }

    @And("^verify shopping cart has delete button$")
    public void verifyShoppingCartHasDeleteButton() {
        new ShoppingCartPage().confirmDeleteIconLogoInShoppingCart();
    }

    @And("^removes item from cart$")
    public void removesItemFromCart() {
        new ShoppingCartPage().removeItemFromCart();
    }

    @And("^verifies the banner display \"([^\"]*)\"$")
    public void verifiesTheBannerDisplay(String display) {
        new ShoppingCartSummaryPage().verifyShoppingCartIsEmptyMessage(display);

    }
}
