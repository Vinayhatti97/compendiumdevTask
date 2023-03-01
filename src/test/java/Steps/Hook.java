package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hook {

//    public static WebDriver driver;
//    @BeforeAll
//    public static void startSession(){
//        System.out.println("Intialize Report");
//        WebDriverManager.chromedriver().setup();
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        ChromeOptions options = new ChromeOptions();
//        desiredCapabilities.setCapability("browserName", "chrome");
//        options.merge(desiredCapabilities);
//        driver = new ChromeDriver(options);
//        driver.get("https://compendiumdev.co.uk/");
//    }
//
//    @AfterAll
//    public static void endSession(){
//        System.out.println("KIll Session");
//        driver.quit();
//    }
//
//    @Before
//    public void beforeStep(){
//        System.out.println("Before Step");
//    }
//
//    @After
//    public void afterStep(){
//        System.out.println("After Step");
//    }
}
