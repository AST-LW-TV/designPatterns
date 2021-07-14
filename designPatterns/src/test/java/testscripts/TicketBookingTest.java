package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TicketBookingTest extends RootTest {

    private HomePage homePage;

    public TicketBookingTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        browserInitialization();
        homePage=new HomePage(driver);
    }

    @Test
    public void ticketForOnePerson(){
        String passengers=homePage.enteringEssentialDetails();
        boolean temp=passengers.contains("1 adult");
        Assert.assertEquals(true,temp);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
