package com.vtiger.genriUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpClass  implements ITestListener{

	public void onTestFailure(ITestResult result) {
		String TestName=result.getMethod().getMethodName();
		System.out.println(TestName+"======Excute & i m listning======");
		EventFiringWebDriver eDriver =new EventFiringWebDriver(BaseClassAnnotation.driver);
		File  srcfile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./screenshot/"+TestName+".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
