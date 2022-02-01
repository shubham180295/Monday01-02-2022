package com.crmcomcast.contacttest;




import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.crmcast.ObjectReporitory.Contacts;
import com.crmcast.ObjectReporitory.CreateNewContact;
import com.crmcast.ObjectReporitory.CreateNewContactInfo;
import com.crmcast.ObjectReporitory.HomePage;
import com.vtiger.genriUtility.BaseClassAnnotation;
import com.vtiger.genriUtility.JavaUtility;
;

public class CreateContactTest extends BaseClassAnnotation {
	
@Test(groups= "RegressionTest")
public void Contact() throws Throwable {
	JavaUtility jLib= new JavaUtility();
	int randomInt =jLib.getRandomNumber();
	//read the data from excel
	
	String Orgname=eLib.getExcelSheet("OrgName", 4, 2)+randomInt;
	String Lstname=eLib.getExcelSheet("OrgName", 4, 3)+randomInt;

	//step2:navigate to contact page
	HomePage h=new HomePage(driver);
	// wLib.waitforElementVisibility(driver, h.getContactlink());
	h.getContactlink().click();
	
	//Create new contact page
	Contacts c=new Contacts(driver);
	c.getCnc().click();
	
	//Actual create contacts
	CreateNewContact cn=new CreateNewContact(driver);
	cn.SaveCreateOrg(Orgname);//here we pass the data from the excel 
	
	//verify the header
	CreateNewContactInfo ci=new CreateNewContactInfo(driver);
	String actalname = ci.getSuccesfullname().getText();
	if(actalname.contains(Orgname)) {
		System.out.println("last name is same then its pass");
	}
	else {
		System.out.println("last name is not contain than its fail");
	}
	System.out.println("i want to commit");
}}
