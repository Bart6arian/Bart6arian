package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.configuration.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://bart6arian.github.io";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @AfterEach
    public void cleanUp() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASKNAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")/fieldset[2]/textarea]";
        final String XPATH_ADDBUTTON = "//form[contains(@action, \"createTask\")/fieldset[3]/button";
        String nameOfTask = "Task#"+generator.nextInt(1000);
        String content = nameOfTask + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASKNAME));
        name.sendKeys(nameOfTask);

        WebElement contentOfTask = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        contentOfTask.sendKeys(content);

        WebElement button = driver.findElement(By.xpath(XPATH_ADDBUTTON));
        button.click();
        Thread.sleep(2000);

        return nameOfTask;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {

        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkIfTaskExistInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("zemstabart");
        driverTrello.findElement(By.id("password")).sendKeys("trello1234kodilla");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(4000);

        driverTrello.findElement(By.id("password")).sendKeys("trello1234kodilla");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(WebElement::click);

        Thread.sleep(4000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        driverTrello.close();

        return result;
    }

    private void cleanup(String taskname) {
        driver.navigate().refresh();

        while(!driver.findElement(By.className("datatable__tasks-container")).isDisplayed());

        driver.findElements(By.xpath("//form/datatable__row")).stream()
                .filter(paragraph ->
                        paragraph.findElement(By.className("datatable__field-value"))
                        .getText().equals(taskname))
                .forEach(button ->
                        button.findElement(By.tagName("Delete")).click());
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkIfTaskExistInTrello(taskName));

        cleanup(taskName);
    }

}
