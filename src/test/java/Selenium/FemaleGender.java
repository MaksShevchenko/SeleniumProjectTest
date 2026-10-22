package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.xpath;

public class FemaleGender {
    static WebDriver driver = new ChromeDriver();
    public static void selectGender(Gender gender) {
        switch (gender) {
            case FEMALE -> {
                By femaleLocator = xpath("//input[@id='gender-radio-2']");
                WebElement webElement = driver.findElement(femaleLocator);
                webElement.click();
            }
            case MALE -> {
                By maleLocator = xpath("//input[@id='gender-radio-1']");
                WebElement webElement = driver.findElement(maleLocator);
                webElement.click();
            }
            case OTHER -> {
                By otherLocator = xpath("//input[@id='gender-radio-3']");
                WebElement webElement = driver.findElement(otherLocator);
                webElement.click();
            }
        }
    }
    @Test
    public void shouldBeSetGender() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
        selectGender(Gender.MALE);
    }
}