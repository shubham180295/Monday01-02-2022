package com.crmcast.ObjectReporitory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Originazation {

public Originazation(WebDriver driver) {
	
	PageFactory.initElements(driver, this);}
	/**
	 * @author shubh
 * @return the orginlink
 */
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorzlink;
	
	public WebElement getcreateorzlink() {
		return createorzlink;
	}
	
}

