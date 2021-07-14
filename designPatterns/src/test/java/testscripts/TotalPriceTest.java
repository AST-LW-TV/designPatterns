package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PaymentPage;

// this test checks the total price is equal to the actual specified value
// this test is expected to fail
public class TotalPriceTest extends RootTest {
    private HomePage homePage;
    private PaymentPage paymentPage;

    public TotalPriceTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("++++++++++Starting the test++++++++++");
        browserInitialization(); // starting the browser
        homePage=new HomePage(driver); // initializing the homePage object
        paymentPage=new PaymentPage(driver); // initializing the paymentPage object
    }

    // example of the failed test
    @Test
    public void totalPrice(){
        homePage.enteringEssentialDetails();
        String price=paymentPage.getTotalPriceForTrip();
        Assert.assertEquals("$199.93",price); // checks the the price
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("++++++++++Ending the test++++++++++");
        driver.quit();
    }
}
