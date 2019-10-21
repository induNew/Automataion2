package com.findelements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadData {

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		}
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		

		
		FileInputStream fis=new FileInputStream("G:\\testcasesel.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet sh=w.getSheet("Sheet1");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// load the url
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("email")).sendKeys(sh.getRow(1).getCell(0).toString());
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(sh.getRow(1).getCell(1).toString());
	
		
		
//		sh.getRow(1).getCell(0).toString()
		
		
		
		
	}

}
	
	
	
	



