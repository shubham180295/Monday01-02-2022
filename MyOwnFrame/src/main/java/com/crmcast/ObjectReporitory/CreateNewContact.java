package com.crmcast.ObjectReporitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genriUtility.WebDriverUtility;

public class CreateNewContact extends WebDriverUtility {
	public WebDriver driver=null;

public CreateNewContact(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//input[@name='lastname']")
private WebElement lstbx;
/**
 * @param orgname 
 * @return the lstbx
 */
public WebElement getLstbx() {
	return lstbx;
}
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement savebx;
/**
 * @return the savebx
 */
public WebElement getSavebx() {
	return savebx;
}
@FindBy (xpath="//input[@name='account_name']/following-sibling::img[@alt='Select']")
private WebElement chooseOrgname;
/**
 * @return the chooseOrgname
 */
public WebElement getChooseOrgname() {
	return chooseOrgname;}

public void SaveCreateOrg(String Lstname) {
	lstbx.sendKeys(Lstname);
	savebx.click();}

public void SaveCreateOrg(String Lstname, String OrgName) {
	lstbx.sendKeys(Lstname);
	chooseOrgname.submit();;
        switchWindow(driver,"Accounts&action");
	CreateNewContactwithOrginization cn=new CreateNewContactwithOrginization(driver);
	cn.getSearchtxtbox().sendKeys(OrgName);
	cn.getSearchNow().click();
	driver.findElement(By.xpath("//a[.='"+OrgName+"')")).click();
	switchWindow(driver, "Contacts&action");
	savebx.click();
}

}
