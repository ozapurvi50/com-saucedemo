package saucedemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //1. Open Url : open the Url into browser
        driver.get(baseUrl);

        //2. Print the title of page
        System.out.println(driver.getTitle());

        //3. Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // FullScreen
        driver.manage().window().fullscreen();

        //4. Print page source
        System.out.println("Print page source : " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //5. Enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("standard_user");

        //6. Enter the password in password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //7. Close driver
        driver.close();
    }
}