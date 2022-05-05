package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AT {

    @DataProvider(name = "AutTest")
    public static Object[][] credentials() {
        return new Object[][]{{"Egor", "Epur", "EgorE@123.12", "Twer"}, {"Egor", "Epur", "Egor@mail.ru", "Twer1234"}};

    }

    @Test(dataProvider = "AutTest")
    public void test(String sFirstName, String sLastName,String sEmail, String sPassword) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.ultimateqa.com/users/sign_up");
        //*[@id="user[last_name]"]

        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sFirstName);

        driver.findElement(By.xpath("//input[@id='user[last_name]']")).clear();
        driver.findElement(By.xpath("//input[@id='user[last_name]']")).sendKeys(sLastName);

        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(sEmail);

        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sPassword);

        driver.findElement(By.xpath("//input[@id='user[terms]']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.quit();

    }
}
