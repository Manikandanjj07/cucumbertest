package com.flipkart.objectrepostry;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.resources.CommomActions;
public class validationpage extends CommomActions{

public validationpage()
{
	PageFactory.initElements(driver,this);
}
@FindBy(name="q")
private WebElement sea;
@FindBy(xpath="//button[text()='✕']")
private WebElement closeclick;

public WebElement getSea() {
	return sea;
}
public WebElement getCloseclick() {
	return closeclick;
}}
