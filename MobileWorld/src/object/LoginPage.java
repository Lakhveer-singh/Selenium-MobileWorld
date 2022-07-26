package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}
	
	By UserName = By.xpath("//*[@id=\"username\"]");
	By Password = By.xpath("//*[@id=\"password\"]");
	public WebElement getUserName() {
		
		return driver.findElement(UserName);
	}
	public WebElement getPassword() {
		
		return driver.findElement(Password);
	}

}
