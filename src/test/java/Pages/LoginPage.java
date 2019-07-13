package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase{	

	@FindBy(xpath="//*[text()='Hello, Sign in']")
	public static WebElement signInLink;

	@FindBy(xpath="//*[contains(text(),'Email')]/following-sibling::input")
	public static WebElement userName;

	@FindBy(xpath="//input[@id='ap_password']")
	public static WebElement password;
	

	@FindBy(id="signInSubmit")
	public static WebElement submitButton;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public static void clickSignInLink() {
		
		signInLink.click();
	}
	
	public static void enterUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public static void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public static void clickSubmit() {
		submitButton.click();;
	}

}
