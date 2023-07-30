package org.tests.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

    // TC #1: Yahoo Title Verification
    // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to Yahoo
        driver.get("https://www.yahoo.com");

        // 3. Verify Title:
        // Expected: Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String currentTitle = driver.getTitle();


        // actual title comes from the browser

        if (currentTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else{
            System.out.println("Title is Not as expected. Verification FAILED! ");
        }


    }


}
