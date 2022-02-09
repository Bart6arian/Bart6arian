package com.kodilla.testing2.facebook;

import com.kodilla.testing2.configuration.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String BUTTON = "u_0_2_hP";
    public static final String XPATH_INPUT_TYPE = "//html/body/main/section/form/input[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.get("https://www.facebook.com");
        driver.findElement(By.name(BUTTON)).click();

        WebElement nameEl = driver.findElement(By.name("firstname"));
        nameEl.sendKeys("John");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Kowalski");

        WebElement element = driver.findElement(By.xpath(XPATH_INPUT_TYPE));
        element.sendKeys("+48 123-456-789");

        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("pass.txt");

        WebElement birthday_day = driver.findElement(By.name("birthday_day"));
        Select select = new Select(birthday_day);
        select.selectByValue("22");

        WebElement birthday_month = driver.findElement(By.name("birthday_month"));
        Select select1 = new Select(birthday_month);
        select1.selectByValue("May");

        WebElement birthday_year = driver.findElement(By.name("birthday_year"));
        Select select2 = new Select(birthday_year);
        select2.selectByIndex(32);

        WebElement man = driver.findElement(By.className("_8esa"));
        man.click();

        WebElement submit = driver.findElement(By.id("u_b_t_7A"));
        submit.click();

    }
}
