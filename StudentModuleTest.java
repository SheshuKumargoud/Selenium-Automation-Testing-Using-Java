package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.StudentPage;

public class StudentModuleTest {
    WebDriver driver;
    StudentPage studentPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://university.test"); // Replace with actual test URL
        studentPage = new StudentPage(driver);
    }

    @Test
    public void testStudentRegistration() {
        studentPage.registerStudent("Sheshu Kumar");
        Assert.assertTrue(driver.getPageSource().contains("Registration Successful"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}