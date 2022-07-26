package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object.LoginPage;

public class LoginApp {
	
	@Test(dataProvider="get")
	public void  LoginApp(String user, String pass) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lakhveer.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button")).click();
	
	LoginPage log = new LoginPage(driver);
	log.getUserName().sendKeys(user);
	log.getPassword().sendKeys(pass);
	driver.findElement(By.xpath("//*[@id=\"submitForm\"]/div[4]/a")).click();
	
	}
	@DataProvider(name="get")
	public Object[][] getData(){
		Object[][] Data = new Object[3][2];
		
		Data[0][0] = "abc@gmail.com";
		Data[0][1] = "singh@123";
		
		Data[1][0] = "abc123@gmail.com";
		Data[1][1] = "singh";
		
		Data[2][0] = "abc123@gmail.com";
		Data[2][1] = "singh@123";
		
		return Data;
	}
}
