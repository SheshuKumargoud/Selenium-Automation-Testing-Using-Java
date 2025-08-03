package pages; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentPage { 
    WebDriver driver;

    By regButton = By.id("register");
    By nameInput = By.id("name");
    By submitButton = By.id("submit");

    public StudentPage(WebDriver driver) {
        this.driver = driver;
    } 

    public void registerStudent(String name) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(regButton).click();
        driver.findElement(submitButton).click();
    }
}
