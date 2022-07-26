package object;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	By firstName =By.xpath("//*[@id=\"myName\"]");
	By lastName = By.xpath("//*[@id=\"myForm\"]/div[1]/div[3]/input");
	By email = By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[1]");
	By pass = By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[2]");
	By num = By.xpath("//*[@id=\"myForm\"]/div[4]/div[2]/input");
	By bio= By.xpath("//*[@id=\"myForm\"]/div[5]/div[2]/textarea");
	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(lastName);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(pass);
	}
	public WebElement getNumber()
	{
		return driver.findElement(num);
	}
	public WebElement getBio()
	{
		return driver.findElement(bio);
	}
}
