package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import pages.MoneyGameRegistrPage;
import pages.MoneyGamingHomePage;
import utils.Driver;

import java.util.Map;


public class StepDefinitionsRegistration {
    WebDriver driver=Driver.getDriver();
    MoneyGameRegistrPage moneyGameRegistrPage = new MoneyGameRegistrPage(driver);
    MoneyGamingHomePage moneyGamingHomePage = new MoneyGamingHomePage(driver);

    @Given("I am on MoneyGaming home page")
    public void i_am_on_money_gaming_home_page() {
        driver = Driver.getDriver();
        driver.get("https://moneygaming.qa.gameaccount.com/");
    }


    @When("I try sign up for new account")
    public void i_try_sign_up_for_new_account() {
        moneyGamingHomePage.clickJoinNowButton();
    }

    @And("I fill up sing up information")
    public void i_fill_up_sing_up_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> signUpInfoMap = dataTable.asMap(String.class, String.class);
        String title = signUpInfoMap.get("title");
        String firstName = signUpInfoMap.get("firstName");
        String surname = signUpInfoMap.get("surname");
        moneyGameRegistrPage.fillUpRegForm(title, firstName, surname);

    }


    @And("I check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18")
    public void i_check_the_tickbox_with_text_i_accept_the_terms_and_conditions_and_certify_that_i_am_over_the_age_of_18() {
        moneyGameRegistrPage.verifyCheckBox();


    }

    @And("I submit the form by clicking the JOIN NOW button")
    public void i_submit_the_form_by_clicking_the_join_now_button() {
        moneyGameRegistrPage.clickFinalJoinButton();


    }

    @Then("I see ‘This field is required’ appears under the date of birth box")
    public void i_see_this_field_is_required_appears_under_the_date_of_birth_box() {
        moneyGameRegistrPage.verifyDOBErrorMSG();


    }

}