package uat;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	private WebDriver driver;
	
	private By aUsername = By.id("txtUserName");
	private By aPassword = By.id("txtPassword");
	private String aUsername1 = ("faisalanaseeb");
	private String aPassword1 = ("Passw0rd");
	private By signinBy = By.xpath("//button[@id='SI_btnSignIn']");
//	private By name = By.id("roleName");
	private String name1 = "System Administrator";
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterDetails() throws InterruptedException {
		driver.findElement(aUsername).sendKeys(aUsername1);
		driver.findElement(aPassword).sendKeys(aPassword1);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(signinBy));		
		driver.findElement(signinBy).click();
		
		Thread.sleep(9000);
				
		if(driver.getPageSource().contains(name1)){
			System.out.println("Logged in");
		} else {
			System.out.println("Not logged in");
			fail();
		}
	}
	
}
