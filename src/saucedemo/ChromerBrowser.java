package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromerBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        //1. launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Open Url : open the Url into browser
        driver.get(baseUrl);

        //3. Print the title of page
        System.out.println(driver.getTitle());

        //4. Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // FullScreen
        driver.manage().window().fullscreen();

        //5. Print page source
        System.out.println("Print page source : "  + driver.getPageSource());

        //6. Enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("standard_user");

        //7. Enter the password in password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //8. Close driver
        driver.close();

    }

}
