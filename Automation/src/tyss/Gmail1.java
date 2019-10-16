package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("sawantsuraj743@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
			
		
	}
}
