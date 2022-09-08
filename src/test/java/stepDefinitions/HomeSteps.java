package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void verifyImHomePage(){
        homePage.verifyHomePageHeaderIsDisplayed();
    }

    @Then("I verify that {string} is displayed")
    public void verfyProductInHomePage(String product){
        homePage.verifyProductInHomePage(product);
    }

}
