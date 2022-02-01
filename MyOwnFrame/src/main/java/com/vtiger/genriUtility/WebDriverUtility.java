package com.vtiger.genriUtility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	WebDriver driver=null;
	/**
	 * this method is wait for 20 secounds until 
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * this method is used to wait the element until is visible
	 * @param driver
	 * @param string
	 */
	public void waitforElementVisibility(WebDriver driver,WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void elementclickable(WebElement element) throws InterruptedException {
		int count=0;
		while(count<20) {
			try {
				element.click();
				break;
			}
			catch(Throwable e) {
				Thread.sleep(2000);
				count++;
			}
		}}
	/**
	 * this class is used to handle drop down using visibility text
	 * @param element
	 * @param option
	 */
		public void select(WebElement element, String option) {
			Select s=new Select(element);
			s.selectByVisibleText(option);
		}
		/**
		 * this class is used to handle dropdown using index value
		 * @param element
		 * @param option
		 * @param index
		 */
		public void select(WebElement element, String option, int index) {
			Select s=new Select(element);
			s.selectByIndex(index);}
		/**
		 * this method is used to move the particular element
		 * @param driver
		 * @param element
		 */
		public void movetoElement(WebDriver driver, WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		public void switchWindow(WebDriver driver, String partialtitle) {
			Set<String> adress = driver.getWindowHandles();
			Iterator<String> itr = adress.iterator();//pass the adress
			while(itr.hasNext()) {
				String win = itr.next();
				String title = driver.switchTo().window(win).getTitle();//
			
			if(title.contains(partialtitle))
			{
				driver.switchTo().window(win);
				break;
			}
			}
			}
			public void acceptAlert(WebDriver driver)
			   {
				   driver.switchTo().alert().accept();
			   }
			   public void cancelAlert(WebDriver driver)
			   {
				   driver.switchTo().alert().dismiss();
			   }
			   /**
			    * This method used for scrolling action in a webpage
			    * @param driver
			    * @param element
			    */
			   public void scrollToWebElement(WebDriver driver, WebElement element) {
				   JavascriptExecutor js=(JavascriptExecutor)driver;
				  int y= element.getLocation().getY();
				   js.executeScript("window.scrollBy(0,"+y+")", element);
			   }
			   
			   
			    public void switchFrame(WebDriver driver,int index) {
			    	driver.switchTo().frame(index);
			    }   
			    
			    public void switchFrame(WebDriver driver,WebElement element) {
			    	driver.switchTo().frame(element);
			    } 
				
			    public void switchFrame(WebDriver driver,String idOrName) {
			    	driver.switchTo().frame(idOrName);
			    } 
			    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
			    	TakesScreenshot ts=(TakesScreenshot)driver;
			    	File src=ts.getScreenshotAs(OutputType.FILE);
			    	File dest=new File("./screenshot/"+screenshotName+".PNG");
			    	Files.copy(src, dest);
			    }
			    
			    /**
			     * pass enter Key appertain in to Browser
			     * @param driver
			     */
			   public void passEnterKey(WebDriver driver) {
				   Actions act = new Actions(driver);
				   act.sendKeys(Keys.ENTER).perform();
			   }
				public void waitforElementVisibility1(WebDriver driver, WebElement orgHeaderSuchInfo) {
					// TODO Auto-generated method stub
					
				} 
}
