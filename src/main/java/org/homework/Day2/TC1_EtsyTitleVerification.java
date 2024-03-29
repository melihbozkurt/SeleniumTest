package org.homework.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_EtsyTitleVerification {

    public static void main(String[] args) {

        // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");

        // 3. Search for “wooden spoon”

        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //5- Verify title:
        //Expected: "Wooden spoon | Etsy"

        String expectedInTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }




    }
}
