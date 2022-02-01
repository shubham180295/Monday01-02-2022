package com.vtiger.genriUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.crmcast.ObjectReporitory.HomePage;
import com.crmcast.ObjectReporitory.LoginPage;

public class BaseClassAnnotation {

		//create object

		public static WebDriver driver;
		public JavaUtility jLib=new JavaUtility();
		public ExcelUtility eLib=new ExcelUtility();
		public  FileUTiltiy fLib=new FileUTiltiy();
		public WebDriverUtility wLib=new WebDriverUtility();



		@BeforeSuite(groups= "RegressionTest")
		public void configBs()
		{
			System.out.println("=====connect to DB=========");
		}

//@Parameters("Browser")
		@BeforeClass(groups= "RegressionTest")
		public void configBc() throws Throwable
		{
			System.out.println("launch browser=======");
			String Browser = fLib.getPropertyKeyValue("browser");
			if(Browser.equals("FireFox")) {
			driver=new FirefoxDriver();}
			else {
				driver=new ChromeDriver();
			}
			wLib.waitUntilPageLoad(driver);
			driver.manage().window().maximize();
		}


		@BeforeMethod(groups= "RegressionTest")
		public void configBm() throws Throwable
		{
			//read common data
			
			String Username = fLib.getPropertyKeyValue("username");
		String pass = fLib.getPropertyKeyValue("password"); 
		String url = fLib.getPropertyKeyValue("url");

			// navigate to Application
			driver.get(url);

			//login page
			LoginPage l=new LoginPage(driver);
			l.LoginToApp(Username, pass);
		}

		@AfterMethod(groups= "RegressionTest")
		public void configAm()
		{
			HomePage h=new HomePage(driver);
			h.Logout();
		}
		@AfterClass(groups= "RegressionTest")
		public void configAc()
		{
			System.out.println("======close the browser====");
			driver.close();
		}
		@AfterSuite(groups= "RegressionTest")
		public void configAs()
		{
			System.out.println("======close DB conn=======");
		}
	}


