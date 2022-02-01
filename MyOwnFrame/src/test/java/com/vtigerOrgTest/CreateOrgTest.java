package com.vtigerOrgTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;


import com.crmcast.ObjectReporitory.CreateNewOrginization;
import com.crmcast.ObjectReporitory.HomePage;
import com.crmcast.ObjectReporitory.LoginPage;
import com.crmcast.ObjectReporitory.Originazation;
import com.crmcast.ObjectReporitory.OriginazationInfo;
import com.vtiger.genriUtility.BaseClassAnnotation;


public class CreateOrgTest  extends BaseClassAnnotation {
	@Test(groups= "smokeTest")
	public void CreateOrg() throws EncryptedDocumentException, IOException {
		int randomInt =jLib.getRandomNumber();
		
		//read the data from excel
		String orgName = eLib.getExcelSheet("OrgName", 1, 2) +randomInt;
		
	
		//navigate the organization
		HomePage h=new HomePage(driver);
		h.getOrglink().click();
		
		//navigate the create organization page;
		Originazation o=new Originazation (driver);
		o.getcreateorzlink().click();
		
		//fill the details of Organization
		CreateNewOrginization ct=new CreateNewOrginization(driver);
		ct.SaveCreateOrg(orgName);
		//verify
		OriginazationInfo oi =new OriginazationInfo(driver);
	wLib.waitforElementVisibility(driver, oi.getSuceessfulmsg());
		String actualheader = oi.getSuceessfulmsg().getText();
		if(actualheader.contains(orgName)) {
			System.out.println("org is created sucessfully and pass>>>");
		}
		else {
		System.out.println("org is not created sucessfully and failed");
		}
		//Assert.assertEquals(actualheader.contains(orgName), false, actualheader);
	}

	@Test(groups= "RegressionTest")

	public void CreateOrgwithindustry() throws EncryptedDocumentException, IOException {
		int randomInt =jLib.getRandomNumber();
		
		//read the data from excel
		String orgName = eLib.getExcelSheet("OrgName", 1, 2) +randomInt;
		String industry=eLib.getExcelSheet("orgName", 0, 3);
		
		//navigate the organization
		HomePage h=new HomePage(driver);
		h.getOrglink().click();
		
		//navigate the create organization page;
		Originazation o=new Originazation (driver);
		o.getcreateorzlink().click();
		
		//fill the details of Organization
		CreateNewOrginization ct=new CreateNewOrginization(driver);
		ct.SaveCreateOrg(orgName);
		//verify
		OriginazationInfo oi =new OriginazationInfo(driver);
	wLib.waitforElementVisibility(driver, oi.getSuceessfulmsg());
		String actualheader = oi.getSuceessfulmsg().getText();
	/*	if(actualheader.contains(orgName)) {
			System.out.println("org is created sucessfully and pass>>>");
		}
		else {
		System.out.println("org is not created sucessfully and failed");
		}*/
	String actualindustery = oi.getIndustrytype().getText();
	if(actualindustery.trim().equals(industry)) {
		System.out.println("org is sucessfully creatwith industry passed");
	}
	else {
		System.out.println("org is not creat sucesfullly with industry failed");
		
		
		System.out.println("i want to commit ");
	}
		//Assert.assertTrue(actualindustery.contains(industry));
	}}


