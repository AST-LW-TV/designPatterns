package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PaymentPage;

public class TotalPriceTest extends RootTest {

    private HomePage homePage;
    private PaymentPage paymentPage;

    public TotalPriceTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        browserInitialization();
        homePage=new HomePage(driver);
        paymentPage=new PaymentPage(driver);
    }

    @Test
    public void totalPrice(){
        homePage.enteringEssentialDetails();
        String price=paymentPage.getTotalPriceForTrip();
        Assert.assertEquals("$199.93",price);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
