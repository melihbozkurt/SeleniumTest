package org.tests.Day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("---> BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running");
    }

    @Test (priority = 1)
    public void Test1(){
        System.out.println("Test 1 is running...");

        // Assert Equals: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        //AssertTrue
        String actual = "apple";
        String expected = "apple2";

        Assert.assertTrue(actual.equals(expected));


    }


}
