package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrginization {
 WebDriver driver;
public CreateNewOrginization(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="accountname")
private WebElement cnorgin;
@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement save;
/**
 * @return the cnorgin
 */
public WebElement getCnorgin() {
	return cnorgin;
}
/**
 * @return the save
 */

@FindBy(name="industry")
private WebElement industrytype;
public WebElement getSave() {
	return save;
}
public void SaveCreateOrg(String OrgName) {
	cnorgin.sendKeys(OrgName);
	Select s=new Select(industrytype);
	s.selectByVisibleText("Engineering");
	save.click();
	
}
}
