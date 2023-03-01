package org.CompandiumdevPages.org;

import SeleniumActions.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    WebDriver driver;

    SeleniumActions seleniumActions;
    public ContactsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
        this.driver = driver;
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

    public void switchToFrameAndenterDetails(){
        WebElement frame1 = driver.findElement(By.xpath("//div[@ class='thumbCellSplit']/script/following-sibling::script/following-sibling::iframe"));
        driver.switchTo().frame(frame1);
        seleniumActions.EnterValueOnTextfield(nametextfield, "vinay");
        seleniumActions.EnterValueOnTextfield(emailtextfield, "vinayhatti5@gmail.com");
        seleniumActions.EnterValueOnTextfield(messagetextfield, "I am not well");

    }

    public void clickOnsubmit() throws InterruptedException {
        Thread.sleep(5000);
        seleniumActions.waitforVisibleAndClick(submitbutton);
        System.out.println("Clicked on submit");
    }

    public boolean verifysuccessfullmessage() throws InterruptedException {
        Thread.sleep(5000);
        boolean result = successfulmessage.isDisplayed();
        return result;
    }

}
