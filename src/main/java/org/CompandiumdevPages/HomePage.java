package org.CompandiumdevPages;

import SeleniumActions.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    SeleniumActions seleniumActions;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }

    @FindBy(xpath = "//div[@ id = 'cssmenu']/ul/li[2]/a")
    WebElement contactbutton;

    /*
    This method will cilck on Contacts button in Homepage
     */
    public void clickOnContact(){
        seleniumActions.waitandClickElement(contactbutton);
    }
}
