package com.cydeo.step_definitions;

import com.cydeo.pages.NevaTestCasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class NevaTestCase_StepDefinitions {

    NevaTestCasePage nevaTestCasePage = new NevaTestCasePage();

    @Given("I am on the homepage of the Automation Exercise website")
    public void i_am_on_the_homepage_of_the_automation_exercise_website() {
        Driver.getDriver().get("https://www.automationexercise.com");
    }

    @When("I can click test case button")
    public void i_can_click_test_case_button() {
        nevaTestCasePage.testCaseButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.click();
    }

    @Then("i should be navigated to test case page")
    public void i_should_be_navigated_to_test_case_page() {
        Assert.assertTrue(nevaTestCasePage.testCaseHeader.isDisplayed());

    }


}
