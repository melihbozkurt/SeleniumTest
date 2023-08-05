package org.tests.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.WebDriverFactory;

public class T5_practiceAll {

    public static void main(String[] args) {

        // 1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Enter incorrect username into login box:
        WebElement loginusername = driver.findElement(By.cssSelector("input[class ='login-inp']"));
        loginusername.sendKeys("asd123asd");

        // 4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();

        // 5- Verify “error” label is as expected:
        //Expected: Login or E-mail not found

        WebElement errorMessage = driver.findElement(By.cssSelector("div[class='errortext'"));


        String expectedMessage = "Login or E-mail not found";
        String actualMessage = errorMessage.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Button text verification PASSED!");
        }else{
            System.out.println("Button text verification FAILED!");
        }










    }
}
