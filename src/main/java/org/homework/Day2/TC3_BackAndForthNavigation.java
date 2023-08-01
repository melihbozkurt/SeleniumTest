package org.homework.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_BackAndForthNavigation {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com");

        // 3- Click to Gmail from top right.
        WebElement gmailClick = driver.findElement(By.className("gb_y"));
        gmailClick.click();

        // 4- Verify title contains:
        // Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Google

        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }



    }
}
