package Tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import Pages.LoginPage;
import UtilityClasses.utils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest extends TestBase { 
	LoginPage loginpage;
	
	
	@Given("^I am on Amazon login page$") 
	public void goToAmazon() { 	
		TestBase.initialize();
		TestBase.launchUrl();
		loginpage =new LoginPage();
		loginpage.clickSignInLink();
	}
	
	@When("^I enter Username and Password from file at \"([^\"]*)\"$") 
	public void enterUserPwd(String path) throws InterruptedException, ParserConfigurationException, IOException {   
		List<List<String>> data=utils.xmlReading(path);
		System.out.println(data);
		for(int i=0; i<data.size(); i++) {
		System.out.println(data.get(i).get(0));
		System.out.println(data.get(i).get(1));
		loginpage.enterUserName(data.get(i).get(0));
		loginpage.enterpassword(data.get(i).get(1));
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		
		System.out.println(ExpectedConditions.alertIsPresent());
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoClassDefFoundError.class);
		}		
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	public void enterUsernameAndPassword(String uname, String pwd) throws InterruptedException {   
		loginpage.enterUserName(uname);
		Thread.sleep(3000);
		loginpage.enterpassword(pwd);
		Thread.sleep(3000);
	}

	@When ("^I enter username as \"(.*)\"$") 
	public void enterUser(String uname) throws InterruptedException {
		loginpage.enterUserName(uname);
		Thread.sleep(3000);
	} 

	@When ("^I enter password as \"(.*)\"$") 
	public void enterPassword(String pwd) {
		loginpage.enterpassword(pwd);
		loginpage.clickSubmit();
	}

	@When("^I enter username$")
	public void I_enter_username(DataTable arg1) throws InterruptedException {
		List<List<String>> data=arg1.raw();
		for(int i=0;i<data.size();i++) {
			loginpage.enterUserName(data.get(i).get(0)); 
		Thread.sleep(3000); 
		}
	}

	@When("^I enter password$")
	public void I_enter_password(DataTable arg1) {
		List<List<String>> data=arg1.raw();
		loginpage.enterpassword(data.get(0).get(0));
		loginpage.clickSubmit();
		driver.findElement(By.xpath("//input[]"));
	}

	@Then("^Login should fail$") 
	public void checkFail() {  
		if(driver.getCurrentUrl().equalsIgnoreCase(
				"https://www.amazon.com/?ref_=nav_ya_signin&")){ 
			System.out.println("Test1 Pass"); 
		} else { 
			System.out.println("Test1 Failed"); 
		} 
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
