package org.tests.Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    public WebDriver driver;

    @BeforeMethod
    public void SetupMethod(){

        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(2000);

        // To be able to click to Alert OK button we need to switch drivers focus alert itself
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        // Failure message will only be displayed if assertion fails: "Result text is NOT displayed"
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed.");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText,expectedText,"Actual result test in not as expected!!");



    }


}
