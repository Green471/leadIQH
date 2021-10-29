package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import pages.RegistrationPage2;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RegistrationStep2 {
    RegistrationPage2 page2 = new RegistrationPage2();
    @Given("user enters company name {string}")
    public void userEntersCompanyName(String companyname) {

        Driver.waitAndSendText(page2.companyName,companyname,5);

    }

    @Given("user provides workspace name {string}")
    public void user_provides_workspace_name(String string) {
        Driver.waitAndSendText(page2.workspaceName,string,5);
    }
    @Then("user selects company size  from dropdown button")
    public void user_selects_company_size_from_dropdown_button() {
        Driver.waitAndClick(page2.companySize,5);
        Driver.waitAndClick(page2.size,5);
    }
    @Then("the user chooses the CRM tool they use")
    public void the_user_chooses_the_crm_tool_they_use() {
        Driver.waitAndClick(page2.crm,5);
    }
    @Then("the user chooses the sales engagement they use")
    public void the_user_chooses_the_sales_engagement_they_use() {
        Driver.waitAndClick(page2.salesEngagement,5);
    }
    @Then("the user Specifies whether the user is using the LinkedIn sales navigator.")
    public void the_user_specifies_whether_the_user_is_using_the_linked_in_sales_navigator() {
       Driver.waitAndClick(page2.linkedinNav,5);
    }
    @Then("user click the Continue button")
    public void user_click_the_continue_button() {
        Driver.waitAndClick(page2.workspacebutton,5);
    }
   @Then("user chooses where she or he wants to save his or her prospects")
    public void user_chooses_where_she_he_wants_to_save_his_her_prospects() {
       Driver.waitAndClick(page2.salesTool,5);
    }
    @Then("user klick on the next buttom and then click on the continue")
    public void user_klick_on_the_next_buttom() {
        Driver.waitAndClick(page2.nextButton,5);

        Driver.waitAndClick(page2.continue1,5);
    }
    @Then("The user clicks the Install button to install the extension.")
    public void the_user_clicks_the_install_button_to_install_the_extension() {
        Driver.waitAndClick(page2.installButton,5);

        Set<String > winHand=Driver.getDriver().getWindowHandles();
        List<String> list= new ArrayList<>();
        list.addAll(winHand);

        Driver.getDriver().switchTo().window(list.get(1));

    }


    @And("user clicks on the Add to chrome button")
    public void userClicksOnTheAddToChromeButton() {
        Driver.waitAndClick(page2.addToChromeButton,5);

        Driver.getDriver().switchTo().alert().accept();
    }


    @And("User verifies whether the LeadIQ extension has been successfully installed")
    public void userVerifiesWhetherTheLeadIQExtensionHasBeenSuccessfullyInstalled() throws IOException {

        Driver.getDriver().get(ConfigurationReader.getProperty("installationsPath"));
        ArrayList<WebElement> list=(ArrayList<WebElement>)Driver.getDriver().findElements(By.id(""));
        //driver.findElements(locator);

    /*    TakesScreenshot screenshot=((TakesScreenshot)Driver.getDriver());
        File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("src/test/screenShot"));

     */

        //C:\Users\adily\AppData\Local\Google\Chrome\User Data\Default\Extensions\aapbdbdomjkkjkaonfhkkikfgjllcleb


    }
}

