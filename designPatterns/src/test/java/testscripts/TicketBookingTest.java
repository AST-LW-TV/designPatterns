package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

// this test checks 1-adult has booked the ticket
public class TicketBookingTest extends RootTest {
    private HomePage homePage;

    public TicketBookingTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("++++++++++Starting the test++++++++++");
        browserInitialization(); // starting the browser
        homePage=new HomePage(driver); // initializing the homePage object
    }

    @Test
    public void ticketForOnePerson(){
        String passengers=homePage.enteringEssentialDetails();
        boolean temp=passengers.contains("1 adult");
        Assert.assertEquals(true,temp); // checking for 1-adult
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("++++++++++Ending the test++++++++++");
        driver.quit();
    }
}
