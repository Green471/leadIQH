package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Driver;

public class RegistrationPage1 {


    public RegistrationPage1() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = ".el-input__inner")
    public WebElement workemail;

    @FindBy(css = ".el-checkbox__inner")
    public WebElement privacycheckbox;

    @FindBy(css = ".button-content")
    public WebElement continuebutton;

    @FindBy (xpath = "//*[ text() ='Invitation Sent' ]")
    public WebElement invitationMessage;

    @FindBy(xpath = "(*//textarea[@class='el-textarea__inner'])[1]")
    public WebElement firsname;

    @FindBy(xpath = "(*//textarea[@class='el-textarea__inner'])[2]")
    public WebElement lastname;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement roleDescribe;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[1]")
    public WebElement selectItemDrop;

    @FindBy(css = ".button-content")
    public WebElement continueButton;








}
