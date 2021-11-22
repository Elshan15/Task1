package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class MoneyGamingHomePage {
    public MoneyGamingHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(text(),'Join Now!')]")
    WebElement joinNowButton;


    @FindBy(id = "title")
    WebElement title;

    public void clickJoinNowButton() {

        joinNowButton.click();
    }


}
