package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I should be in the home page")
    public void verifyImHomePage(){
        homePage.verifyHomePageHeaderIsDisplayed();
    }
}
