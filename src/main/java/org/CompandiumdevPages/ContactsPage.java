package org.CompandiumdevPages;

import SeleniumActions.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readFromfile.Readfromjson;

import java.io.IOException;

public class ContactsPage {

    WebDriver driver;

    SeleniumActions seleniumActions;

    Readfromjson readfromjson;
    public ContactsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
        this.driver = driver;
        readfromjson = new Readfromjson();
    }

    @FindBy(xpath = "//input[@ name ='name']")
    WebElement nametextfield;

    @FindBy(xpath = "//input[@ name ='email']")
    WebElement emailtextfield;

    @FindBy(xpath = "//textarea[@ name ='message']")
    WebElement messagetextfield;

    @FindBy(xpath = "//div[@ id='sendiconDiv']")
    WebElement submitbutton;

    @FindBy(xpath = "//div[@ class='SuccessMessage']")
    WebElement successfulmessage;

    /*
    This method will switch control from main page to frame and enter the details
     */

    public void switchToFrameAndenterDetails() throws IOException {
        WebElement frame1 = driver.findElement(By.xpath("//div[@ class='thumbCellSplit']/script/following-sibling::script/following-sibling::iframe"));
        driver.switchTo().frame(frame1);
        seleniumActions.EnterValueOnTextfield(nametextfield,readfromjson.readFile("name") );
        seleniumActions.EnterValueOnTextfield(emailtextfield, readfromjson.readFile("email"));
        seleniumActions.EnterValueOnTextfield(messagetextfield, readfromjson.readFile("message"));

    }

    /*
    This method will click on submit button in Contacts page
     */
    public void clickOnsubmit() throws InterruptedException {
        Thread.sleep(5000);
        seleniumActions.waitforVisibleAndClick(submitbutton);
        System.out.println("Clicked on submit");
    }

    /*
    This method will verify the message after filling the details in contacts page
     */
    public boolean verifysuccessfullmessage() throws InterruptedException {
        Thread.sleep(5000);
        boolean result = successfulmessage.isDisplayed();
        return result;
    }

}
