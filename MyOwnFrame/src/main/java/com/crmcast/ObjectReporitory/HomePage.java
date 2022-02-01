package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genriUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility{
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);}

	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement contactlink;

	/**
	 * @return the contactlink
	 */
	public WebElement getContactlink() {
		return contactlink;
	}

	@FindBy(linkText = "Products")
	private WebElement prductlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Adminstrator;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement sgout;
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the orglink
	 */
	public WebElement getOrglink() {
		return orglink;
	}

	/**
	 * @return the prductlink
	 */
	public WebElement getPrductlink() {
		return prductlink;
	}

	/**
	 * @return the adminstrator
	 */
	public WebElement getAdminstrator() {
		return Adminstrator;
	}

	/**
	 * @return the sgout
	 */
	public WebElement getSgout() {
		return sgout;
	}

	public void Logout() {
		Actions a=new Actions(driver);
	a.moveToElement(Adminstrator).perform();
	sgout.click();
	
	}
}

