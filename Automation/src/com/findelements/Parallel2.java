package com.findelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel2 {

	
		WebDriver driver;
		@BeforeTest
		@Parameters("browser")
		public void setUp(String browser)throws Exception
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			
		}
		
		
	@Test
	
	public void test1()
	{
		driver.get("https://www.google.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
}
