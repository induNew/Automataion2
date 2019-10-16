package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAct {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}


	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/actitime.html");
		// using tag name locator
		
		WebElement link=driver.findElement(By.tagName("a"));
		link.click();
		//click on the first google link
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		//use the locator id for click
		
		
		
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//use the locator name  for click
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		
		//use the locator class for click
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		

//		driver.findElement(By.linkText("Google")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
//		
//		
//		
//		driver.findElement(By.partialLinkText("Go")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
		
		
		
		
	
		driver.close();
		
		

	}

}
