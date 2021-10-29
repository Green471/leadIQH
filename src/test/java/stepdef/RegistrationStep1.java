package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.RegistrationPage1;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStep1 {
    RegistrationPage1 page1 =new RegistrationPage1();


    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("account_url"));
    }
    @Given("user enters workemail {string} and click on the privacy check box and click on the continue button")
    public void user_enters_workemail(String workemail) {
        Driver.waitAndClick(page1.workemail,5);
        Driver.waitAndSendText(page1.workemail,workemail,5);
        Driver.waitAndClick(page1.privacycheckbox,5);
        Driver.waitAndClick(page1.continuebutton,5);

    }

    @Then("the user klicks on the invite link")
    public void the_user_klicks_on_the_invite_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("invite_url"));
    }

    @Then("the user click on the login button")
    public void the_user_click_on_the_login_button() {

    }

    @Then("the user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String string) {
        Assert.assertEquals(Driver.waitAndGetText(page1.invitationMessage,5),string);

    }

    @Then("user enters firstname and lastname as {string} and {string}")
    public void user_enters_firstname_and_lastname_as_and(String firstname, String lastname) {
        Driver.waitAndSendText(page1.firsname,firstname,5);
        Driver.waitAndSendText(page1.lastname,lastname,5);
    }



    @Then("user klicks on roledescription box end selects the best description")
    public void userKlicksOnRoledescriptionBoxEndSelectsTheBestDescription() {
        Driver.waitAndClick(page1.roleDescribe,5);
        Driver.waitAndClick(page1.selectItemDrop,5);
    }

    @Then("if user enters invalid email sould be able to see {string}")
    public void if_user_enters_invalid_name_sould_be_able_to_see(String string) {
      //  Assert.assertEquals(Driver.waitAndGetText(loginpage.invalidEmailMessages,5),string);
      //  System.out.println(string);
    }


    @When("user provides a password {string}")
    public void user_provides_a_password(String password) {
        Driver.waitAndSendText(page1.password,password,5);
    }

    @Then("user click mobilephone as {string}")
    public void user_click_mobilephone_as(String phone) {
        Driver.waitAndSendText(page1.phoneNumber,phone,5);
    }


    @And("the user click on the continue button")
    public void theUserClickOnTheContinueButton() {
        Driver.waitAndClick(page1.continueButton,5);
    }
}
