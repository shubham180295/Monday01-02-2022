package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactInfo {
public CreateNewContactInfo(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement Succesfullname;
/**
 * @return the succesfullname
 */
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement industrytype;
/**
 * @return the industrytype
 */
public WebElement getIndustrytype() {
	return industrytype;
}
public WebElement getSuccesfullname() {
	return Succesfullname;
}

}

