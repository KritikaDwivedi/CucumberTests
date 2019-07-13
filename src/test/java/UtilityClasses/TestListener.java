package UtilityClasses;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Base.TestBase;

public class TestListener extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub	
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub	
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String fileName="failed_" + result.getName()+".jpg";	;
		try {
			org.openqa.selenium.io.FileHandler.copy(src, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+fileName));
			//org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\kritika.dwivedi\\eclipse-workspace\\CucumberTest\\ScreenShots\\"+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub	
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String fileName="failed_" + arg0.getName();	;
		try {
			org.openqa.selenium.io.FileHandler.copy(src, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
