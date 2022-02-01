package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OriginazationInfo {
public OriginazationInfo(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(className="dvHeaderText")
private WebElement Suceessfulmsg;
/**
 * @return the suceessfulmsg
 */
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement industrytype;
/**
 * @return the industrytype
 */
public WebElement getIndustrytype() {
	return industrytype;
}
public WebElement getSuceessfulmsg() {
	return Suceessfulmsg;

}

}


