package tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uat.Login;


public class LoginTest {
	
	WebDriver driver;
	Login myLogin;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://uat.edofe.org");
	}	
	
	@Test
	public void myTest() throws Exception {		
		Login myLogin = new Login(driver);
		myLogin.enterDetails();
	}
}
