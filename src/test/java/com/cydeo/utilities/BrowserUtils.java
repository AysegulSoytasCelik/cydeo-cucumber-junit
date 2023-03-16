package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
        this method will accept int (in seconds) and execute Thread.sleep for given duration
         */
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    /*
    This method accepts # arguments:
    Arg1: webdriver
    Arg2: expectedInUrl: for verify if the url contains given String
            -If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles =Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains("expectedInUrl")){
                break;
            }
        }
        //5. Assert: Title contains "expectedInTitle"

        String actualTitle= Driver.getDriver().getTitle();

        //   Assert.assertEquals(expectedInTitle,actualTitle); or
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }



    /*
    This method accepts a String  "expectedTitle" and Asserts if it is true

     */
    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }

    /**
     * This method will verify if the current URL contains expected value
     * @param expectedInURl
     */
    public static void verifyURLContains(String expectedInURl){

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURl));

    }

    /**
     * this method will accept a dropdown as a webElement
     * and return all the options' text in a List of String.
     *
     * @param dropdownElement
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select =new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();


        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        return  actualOptionsAsString;
    }

    /*
    Creating a utility method for ExplicitWait so, we don't have to repeat the lines
     */
   /* public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10  );
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    */
}
