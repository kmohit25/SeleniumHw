package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavigationBar extends Base {

    @Test
    public void basePageNavigation() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage Lpage = new LandingPage(driver);

        Assert.assertTrue(Lpage.getNavigationBar().isDisplayed());
    }
}
