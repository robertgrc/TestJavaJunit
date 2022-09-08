package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class OverviewPage {
    private Page driver;
   // private Locator SauceLabsBikeLightItem;


    public OverviewPage(Page driver){
        this.driver = driver;
        //this.SauceLabsBikeLightItem = driver.locator("//div[text()=\"Sauce Labs Bike Light\"]");
    }

   public void verifySauceLabsBikeLightMessage(){
       Assert.assertTrue(driver.
               isVisible("//*[@id=\"item_0_title_link\"]/div"));
   }

}
