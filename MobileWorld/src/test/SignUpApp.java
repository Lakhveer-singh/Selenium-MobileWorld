package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object.SignUpPage;

public class SignUpApp {
		
	@Test(dataProvider="get")
	public void SignUpApp(String first,String last,String email,String pass,String num,String bio) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhveer.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/p/a")).click();
		
		SignUpPage Sup = new SignUpPage(driver);
		Sup.getFirstName().sendKeys(first);
		Sup.getLastName().sendKeys(last);
		Sup.getEmail().sendKeys(email);
		Sup.getPassword().sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[2]/input")).sendKeys("15-10-2002");
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		 
		Sup.getNumber().sendKeys(num);
		Sup.getBio().sendKeys(bio);
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/button")).click();
		
		String msg = driver.switchTo().alert().getText();
		Assert.assertEquals(msg,"Hai,"+first+"! Go To SignIn");
		driver.switchTo().alert().accept();
		
		driver.quit();
	}
	@DataProvider(name="get")
	public Object  getData(){
		Object[][] Data = new Object[3][6];
		
		Data[0][0]="Lakhveer";
		Data[0][1]="Singh";
		Data[0][2]="abc123@gmail.com";
		Data[0][3]="singh@123";
		Data[0][4]="9797979797";
		Data[0][5]="I am singh";
		
		Data[1][0]="Singh123";
		Data[1][1]="";
		Data[1][2]="abc123@gmail.com";
		Data[1][3]="singh@123";
		Data[1][4]="9797979797abd";
		Data[1][5]="I am singh";
		
		
		
		Data[2][0]="";
		Data[2][1]="Singh123";
		Data[2][2]="abc123@gmail.com";
		Data[2][3]="singh@123";
		Data[2][4]="9797979797";
		Data[2][5]="I am singh";
		
		return Data;
		
		
		}
		
	
}
