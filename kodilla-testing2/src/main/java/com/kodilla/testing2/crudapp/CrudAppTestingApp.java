package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.configuration.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_TXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAITFOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"task-container\")]/from/div/fieldset/sel";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.get("https://bart6arian.github.io");

        WebElement e = driver.findElement(By.xpath(XPATH_INPUT));
        e.sendKeys("New task todo");

        WebElement e1 = driver.findElement(By.xpath(XPATH_TXTAREA));
        e.sendKeys("task to do sooon!");

        while(!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select select = new Select(selectCombo);
        select.selectByIndex(1);
    }
}
