package uiTests;

import core.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom1.LogPage;

import static entities.BaseClass.*;

@Test
public class AutomationTest extends BaseTest {

    public void test(){

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://courses.ultimateqa.com/");
        driver.manage().window().maximize();

        LogPage loginPage = new LogPage(driver);

        loginPage.signIn.click();
        loginPage.createBtn.click();
        loginPage.firstname.sendKeys(FistN);
        loginPage.lastname.sendKeys(LastN);
        loginPage.email.sendKeys(Email);
        loginPage.password.sendKeys(Pass);
        loginPage.checkbox.click();
        loginPage.submitBtn.click();

    }
}
