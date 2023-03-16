package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NevaTestCasePage {

    public NevaTestCasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.=' Test Cases']")
    public WebElement testCaseButton;

    @FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']")
    public WebElement testCaseHeader;


}
