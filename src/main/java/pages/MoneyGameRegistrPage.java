package pages;

import com.sun.source.tree.IfTree;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MoneyGameRegistrPage {
    public MoneyGameRegistrPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "title")
    WebElement titlePerson;

    @FindBy(xpath = "//input[@id='forename']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    WebElement lastNameField;

    @FindBy(xpath = "//label[@for='dob']")
    WebElement dobErrorMSG;

    @FindBy(xpath = "//input[@name='map(terms)']")
    WebElement acceptCheckBox;

    @FindBy(xpath = "//input[@id='form']")
    WebElement joinNowFinalButton;

    public void fillUpRegForm(String title, String firstName, String surname) {
        Select select = new Select(titlePerson);
        select.selectByValue(title);

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(surname);

    }


    public void verifyCheckBox() {
        if (!acceptCheckBox.isSelected()) {
            acceptCheckBox.click();
        }

    }


    public void clickFinalJoinButton() {
        joinNowFinalButton.click();
    }

    public void verifyDOBErrorMSG() {
        String expectedDOBErrorMSG = "This field is required";
        String actualDOBErrorMSG = dobErrorMSG.getText().trim();
        Assert.assertEquals(expectedDOBErrorMSG, actualDOBErrorMSG);
    }

}
