package org.tests.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1- Setting up the web driver manager

        // WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jakobiyan\\Desktop\\chromedriver.exe");

        // 2- Create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        // 3- Test if driver is working as expected
        driver.get("https://www.google.com");

    }
}
