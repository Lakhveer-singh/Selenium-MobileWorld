package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	WebDriver driver;

	public ContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	By username = By.xpath("/html/body/div/div/div[2]/form/div[1]/input");
	By email = By.xpath("/html/body/div/div/div[2]/form/div[2]/input");
	By phone = By.xpath("/html/body/div/div/div[2]/form/div[3]/input");
	By msg = By.xpath("/html/body/div/div/div[2]/form/div[4]/textarea");
	
	public WebElement getUserName() {
		return driver.findElement(username);
	}
	public WebElement getEmail() {
		 
		return driver.findElement(email);
	}
	public WebElement getPhone() {
		// TODO Auto-generated method stub
		return driver.findElement(phone);
	}
	public WebElement getMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(msg);
	}
	

}
