package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {

    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username, String Password) throws IOException {

        driver=initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage Lpage = new LandingPage(driver);

        Lpage.getLogin().click();

        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Username);
        //System.out.println(Text);
        lp.getLogin().click();
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[1][2];
        data[0][0]="nonrestricterABC@GMAIL.COM";
        data[0][1]= "123456";
        //data[0][2]="NonRestricted User";

        /*data [1][0]="restricterABC@GMAIL.COM";
        data [1][1]="45678";
        data [1][2]="Resticted user";*/
        return data;


    }
}