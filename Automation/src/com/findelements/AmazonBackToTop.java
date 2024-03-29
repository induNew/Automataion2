package com.findelements;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class AmazonBackToTop{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	

//	static int count=0;
//    public static void screen(WebDriver driver) throws IOException {
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File sc = ts.getScreenshotAs(OutputType.FILE);
//	File ff = new File("./Website2/Amazon" + count + ".png");
//	Files.copy(sc, ff);
//	count++;
//}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");// load the url
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;//casting
		Thread.sleep(2000);
		
		WebElement ele=	driver.findElement(By.xpath("//span[text()='Back to top']"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Back to top']")).click();
	
	
	}
}