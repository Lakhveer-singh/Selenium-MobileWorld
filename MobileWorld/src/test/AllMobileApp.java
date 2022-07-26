package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllMobileApp {
	@Test
	public void AllMobileApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhveer.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		Thread.sleep(2000);
		String serchText = "app";
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(serchText);
		
		WebElement VerifyResult = driver.findElement(By.xpath("//tbody[@id=\"myTable\"]/tr[4]/td[1]"));
		
		Assert.assertTrue(VerifyResult.getText().toLowerCase().contains(serchText),"[ASSERTION FAILED]:Message displayed '" + VerifyResult.getText() + "' ");
		 System.out.println("displayed message "+ VerifyResult.getText());
		 
		 driver.quit();
		
		
		
	}
}
