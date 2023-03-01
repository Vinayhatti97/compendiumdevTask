package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.CompandiumdevPages.HomePage;
import org.CompandiumdevPages.org.ContactsPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StepsToContact  {

    public  static WebDriver driver;

    @Before
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        desiredCapabilities.setCapability("browserName", "chrome");
        options.merge(desiredCapabilities);
        driver = new ChromeDriver(options);
        driver.get("https://compendiumdev.co.uk/");
    }


    @Given("when user on home page and click on Contact")
    public void when_user_on_home_page_and_click_on_contact() {
        System.out.println("started");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnContact();
    }
    @When("user Enter Name and Email and Message")
    public void user_enter_name_and_email_and_message() throws InterruptedException {
        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.switchToFrameAndenterDetails();


    }
    @Then("Click on submit")
    public void click_on_submit() throws InterruptedException {
        ContactsPage contactsPage = new ContactsPage(driver);
        Thread.sleep(5000);
        contactsPage.clickOnsubmit();
    }
    @And("Verify form submitted successfully")
    public void verify_form_submitted_successfully() throws InterruptedException {
        ContactsPage contactsPage = new ContactsPage(driver);
        boolean result =contactsPage.verifysuccessfullmessage();
        Assert.assertTrue(result);
    }


}
