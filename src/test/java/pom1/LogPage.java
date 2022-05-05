package pom1;

import core.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPage extends AbstractPom {
    public LogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(partialLinkText = "Sign")
    public WebElement signIn;

    @FindBy(partialLinkText = "Create a new account")
    public WebElement createBtn;

    @FindBy(id = "user[first_name]")
    public WebElement firstname;

    @FindBy(id = "user[last_name]")
    public WebElement lastname;

    @FindBy(id = "user[email]")
    public WebElement email;

    @FindBy(name = "user[password]")
    public WebElement password;

    @FindBy(id = "user[terms]")
    public WebElement checkbox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitBtn;
}