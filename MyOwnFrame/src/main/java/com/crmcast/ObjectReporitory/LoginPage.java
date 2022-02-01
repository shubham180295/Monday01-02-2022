package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 @FindBy(name="user_name")
 private WebElement ustbx;
 @FindBy (name="user_password")
 private WebElement pwtbx;
 @FindBy (id="submitButton")
 private WebElement lgn;
/**
 * @return the ustbx
 */
public WebElement getUstbx() {
	return ustbx;
}
/**
 * @return the pwtbx
 */
public WebElement getPwtbx() {
	return pwtbx;
}
/**
 * @return the lgn
 */
public WebElement getLgn() {
	return lgn;
}
 public void LoginToApp(String username, String password) {
	 ustbx.sendKeys(username);
	 pwtbx.sendKeys(password);
	 lgn.click();
 }
 
 
}
