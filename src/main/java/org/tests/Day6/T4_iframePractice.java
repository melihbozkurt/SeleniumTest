package org.tests.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T4_iframePractice {

    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void SetupMethod(){

        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }

    //@Ignore
    @Test
    public void iframe_test(){

        // We need to switch drivers focus to iframe
        // option #1 switching to iframe using id attribute value
        // driver.switchTo().frame("mce_0_ifr");

        //option #2 passing index number of iframe
        //driver.switchTo().frame(0);

        //option #3 locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        // Locate the p tag
        WebElement yourContentGoesHereText= driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        // To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());




    }


}
