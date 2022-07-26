package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object.ContactPage;

public class ContactApp {
	
	@Test(dataProvider="get")
	public void ContactApp(String user,String email,String phone,String msg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhveer.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/div/a[2]")).click();
		
		Set <String> currentHandle =driver.getWindowHandles();
		Iterator<String> it = currentHandle.iterator();
		String parentId = it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		
		ContactPage C =  new ContactPage(driver);
		C.getUserName().sendKeys(user);
		C.getEmail().sendKeys(email);
		C.getPhone().sendKeys(phone);
		C.getMessage().sendKeys(msg);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input")).click();
	}
	@DataProvider(name="get")
	     public Object getData() {
			Object[][] Data = new Object[2][4];
			
			Data[0][0] = "Lakhveer";
			Data[0][1] ="abd234@gmail.com";
			Data[0][2] = "8787878787";
			Data[0][3] = "I am the Boss.";
			
			Data[1][0] = "Singh1223";
			Data[1][1] ="abdgmail.com";
			Data[1][2] = "777777nn777";
			Data[1][3] = "I have a Query.";
			
			return Data;
			
			
			
			
	}
}
