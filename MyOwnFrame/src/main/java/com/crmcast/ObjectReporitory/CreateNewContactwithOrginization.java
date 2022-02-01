package com.crmcast.ObjectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactwithOrginization {
public CreateNewContactwithOrginization(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(id="search_txt")
private WebElement searchtxtbox;
/**
 * @return the searchtxtbox
 */
public WebElement getSearchtxtbox() {
	return searchtxtbox;
}
	
	
	@FindBy(name="search")
	private WebElement searchNow;
	/**
	 * @return the searchNow
	 */
	public WebElement getSearchNow() {
		return searchNow;
}
}