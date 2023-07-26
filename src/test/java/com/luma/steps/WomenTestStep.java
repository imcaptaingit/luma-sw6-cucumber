package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenJacketPage;
import io.cucumber.java.en.And;

public class WomenTestStep {
    @And("I mouse hover on Women Menu and mouse Hover on Tops and I click on Jackets")
    public void iMouseHoverOnWomenMenuAndMouseHoverOnTopsAndIClickOnJackets() {
        new HomePage().clickOnDropdownWomen();
    }


    @And("I select sort By filter “Product Name” and I verify the products name display in alphabetical order")
    public void iSelectSortByFilterProductNameAndIVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        new WomenJacketPage().selectAndVerifySortByFilterProductName();
    }

    @And("I select Sort By filter “Price” and verify the products price display in Low to High")
    public void iSelectSortByFilterPriceAndVerifyTheProductsPriceDisplayInLowToHigh() {
        new WomenJacketPage().selectAndVerifySortByPrice();
    }
}
