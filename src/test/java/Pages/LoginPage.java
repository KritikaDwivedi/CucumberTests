package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{	

	@FindBy(xpath="//*[text()='Hello, Sign in']")
	public WebElement signInLink;

	@FindBy(xpath="//*[contains(text(),'Email')]/following-sibling::input")
	public WebElement userName;

	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;

	@FindBy(id="signInSubmit")
	public WebElement submitButton;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public void clickSignInLink() {
		
		signInLink.click();
	}
	
	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		submitButton.click();;
	}

}
