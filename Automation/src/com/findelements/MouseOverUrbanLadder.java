package com.findelements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseOverUrbanLadder {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	static int count = 15;

	public static void screen(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/" + name + ".png");
		Files.copy(sc, ff);
		count++;

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");// load the url

		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();// close the pop up

		Thread.sleep(4000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));// x path for getting
																									// mouse over action
		Actions a = new Actions(driver);// To perform mouse overAction
		//

		for (WebElement name : menu) {
			String menuName = name.getText();// to get the header text
			System.err.println(menuName);// to get the headers in red color like error
			a.moveToElement(name).build().perform();// to mouse over
			MouseOverUrbanLadder.screen(driver, menuName);
			Thread.sleep(1000);
		}

		// Actions a = new Actions(driver);
		// Thread.sleep(4000);

		// for (WebElement name : menu) {
		//
		// a.moveToElement(name).build().perform();// to mouse over
		// Thread.sleep(1000);
		//
		// }
		// driver.findElement(By.xpath("//li[2]/a[@title='Diamond Rings']")).click();
		// screen(driver);
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@id='top-filter']/descendant::section[1]")).click();
		// screen(driver);
		// //// div[@id='top-filter']/descendant::section[1]
		//
		// // nav[@class=\"wh-navbar\"]/descendant::li[2]
		// // div[@id='top-filter']/descendant::div[@class='content']
		// List<WebElement> menu1 =
		// driver.findElements(By.xpath("//form[@id=\"price\"]/div/div/span"));
		// screen(driver);
		// for (WebElement name : menu1) {
		// String price = name.getText();
		//
		// System.out.println(price);
		// }
		//
		// driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline
		// i-right']")).click();
		// screen(driver);
		// }
	}
}
