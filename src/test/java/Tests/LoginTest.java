package Tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import Pages.LoginPage;
import TestBase.TestBase;
import Utilities.utils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest extends TestBase { 
	LoginPage login;
	@Given("^I am on Amazon login page$") 
	public void goToAmazon() { 	
		TestBase.initialize();
		TestBase.launchUrl();
		login=new LoginPage();
		LoginPage.clickSignInLink();
	}
	
	@When("^I enter Username and Password from file at \"([^\"]*)\"$") 
	public void enterUserPwd(String path) throws InterruptedException, ParserConfigurationException, IOException {   
		List<List<String>> data=utils.xmlReading(path);
		System.out.println(data);
		for(int i=0; i<data.size(); i++) {
		System.out.println(data.get(i).get(0));
		System.out.println(data.get(i).get(1));
		LoginPage.enterUserName(data.get(i).get(0));
		LoginPage.enterpassword(data.get(i).get(1));
		Thread.sleep(5000);
		}	
		
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	public void enterUsernameAndPassword(String uname, String pwd) throws InterruptedException {   
		LoginPage.enterUserName(uname);
		Thread.sleep(3000);
		LoginPage.enterpassword(pwd);
		Thread.sleep(3000);
	}

	@When ("^I enter username as \"(.*)\"$") 
	public void enterUser(String uname) throws InterruptedException {
		LoginPage.enterUserName(uname);
		Thread.sleep(3000);
	} 

	@When ("^I enter password as \"(.*)\"$") 
	public void enterPassword(String pwd) {
		LoginPage.enterpassword(pwd);
		LoginPage.clickSubmit();
	}

	@When("^I enter username$")
	public void I_enter_username(DataTable arg1) throws InterruptedException {
		List<List<String>> data=arg1.raw();
		for(int i=0;i<data.size();i++) {
		LoginPage.enterUserName(data.get(i).get(0)); 
		Thread.sleep(3000); 
		}
	}

	@When("^I enter password$")
	public void I_enter_password(DataTable arg1) {
		List<List<String>> data=arg1.raw();
		LoginPage.enterpassword(data.get(0).get(0));
		LoginPage.clickSubmit();
	}

	@Then("^Login should fail$") 
	public void checkFail() {  
		if(driver.getCurrentUrl().equalsIgnoreCase(
				"https://www.amazon.com/?ref_=nav_ya_signin&")){ 
			System.out.println("Test1 Pass"); 
		} else { 
			System.out.println("Test1 Failed"); 
		} 
		Assert.assertEquals("abc", "def");
		driver.close(); 
	}

	@Then("^Relogin option should be available$") 
	public void checkRelogin() throws IOException { 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File(System.getProperty("user.dir")+"ScreenShots"+"exception.jpg"));
		if(driver.getCurrentUrl().equalsIgnoreCase(
				"https://www.amazon.com/ap/signin")){ 
			System.out.println("Test2 Pass"); 
		} else { 
			System.out.println("Test2 Failed"); 
		} 
		driver.close(); 
	}

}
