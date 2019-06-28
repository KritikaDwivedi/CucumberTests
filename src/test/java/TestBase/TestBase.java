package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver; 
	public static Properties prop;
	public TestBase() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("Resources\\application.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialize() {
		String browser=prop.getProperty("browser");
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "Resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "Resources\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("ie")){
			System.setProperty("webdriver.chrome.driver", "Resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}}

	public static void launchUrl() {
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
}
