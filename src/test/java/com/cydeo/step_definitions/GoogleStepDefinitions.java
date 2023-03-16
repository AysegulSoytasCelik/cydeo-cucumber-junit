package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void userTypesAndClicksEnter2 () {
        googleSearchPage.searchBox.sendKeys("apple"+Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }

    @Then("user sees {string} in the  google title")
    public void userSeesInTheGoogleTitle(String string) {
        String expectedTitle = string+ " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        // JUnit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not expected!", expectedTitle, actualTitle);

    }

    @Then("user sees apple in the  google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        // JUnit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not expected!", expectedTitle, actualTitle);
        // if you need boolean value ---> Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on Google search page");

        Driver.getDriver().get("https://www.google.com");
        WebElement agreeButton = Driver.getDriver().findElement(By.id("L2AGLb"));
        agreeButton.click();
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User is seeing title is Google");


        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }







}
