package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	 WebDriver driver;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By FirstName = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[1]/input");
	By LastName = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input");
	By Email = By.xpath("//*[@id=\"inputEmail\"]");
	By Password = By.xpath("//*[@id=\"inputPassword\"]");
	By Mobile = By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input");
	By Address1 = By.xpath("//*[@id=\" address1\"]");
	By Address2 = By.xpath("//*[@id=\"address2\"]");
	By City = By.xpath("//*[@id=\"inputCity\"]");
	
	By Zip = By.xpath("//*[@id=\"inputZip\"]");
	By Count = By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/input");
	
	public WebElement getFirstName() {
		// TODO Auto-generated method stub
		return driver.findElement(FirstName);
	}
	 
	public WebElement getLastName() {
		return driver.findElement(LastName);
	}

	public WebElement getEmail() {
		return driver.findElement(Email);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getMobile() {
		return driver.findElement(Mobile);
	}
	public WebElement getAddress1 () {
		return driver.findElement(Address1 );
	}
	public WebElement getAddress2() {
		return driver.findElement(Address2);
	}
	public WebElement getCity() {
		return driver.findElement(City);
	}
	public WebElement getZip() {
		return driver.findElement(Zip);
	}
	public WebElement getCount() {
		return driver.findElement(Count);
	}
	
	 
}
