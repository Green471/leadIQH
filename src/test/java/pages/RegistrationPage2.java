package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage2 {
    public RegistrationPage2() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@name='company'])[1]")
    public WebElement companyName;

    @FindBy(xpath = "(//input[@name='company'])[2]")
    public WebElement workspaceName;

    @FindBy(xpath = "(//input[@class='el-input__inner'])[3]")
    public WebElement companySize;

    @FindBy(xpath = "(//li[@class='el-select-dropdown__item'])[1]")
    public WebElement size;

    @FindBy(xpath = "(//span[@class='el-radio__label'])[1]")
    public WebElement crm;

    @FindBy(xpath = "(//span[@class='el-radio__label'])[6]")
    public WebElement salesEngagement;

    @FindBy(xpath = "(//span[@class='el-radio__label'])[10]")
    public WebElement linkedinNav;

    @FindBy(css = ".button-content")
    public WebElement workspacebutton;

    @FindBy(xpath = "(//span[@class='el-checkbox__input'])[4]")
    public WebElement salesTool;

    @FindBy(xpath = "//*[@id='app']/div/div[5]/div[2]")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@id='app']/div/div[5]/div[2]/div")
    public WebElement continue1;

    @FindBy(xpath = "//*[@id='app']/div/div[5]/div[2]/div")
    public WebElement installButton;

    @FindBy(xpath = "(//div[@class='g-c-Hf'])[1]")
    public WebElement addToChromeButton;

    @FindBy(id = "extension-id")
    public WebElement extantionId;
}
