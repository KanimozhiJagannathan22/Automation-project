package com.DMSautomation;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_dms {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://winserv2012.datafabricx.com/DFXDMSLite/DFXWebApp/Home/");
		
	    driver.findElement(By.linkText("DMS")).click();	
			
		Thread.sleep(2000);
		
		WebElement sdms = driver.findElement(By.linkText("Search DMS"));
		JavascriptExecutor sd = (JavascriptExecutor)driver;
		sd.executeScript("arguments[0].click()", sdms);
//		driver.findElement(By.linkText("Search DMS")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("savedQueryNameDiv_1")).sendKeys("New Query");
		
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//input[@placeholder='Select a Criteria']"));
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		sc.executeScript("arguments[0].click()", src);
//		driver.findElement(By.xpath("//input[@placeholder='Select a Criteria']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search_entryid_1")).sendKeys("1260");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchDataBtn")).click();
		
		Thread.sleep(2000);
		
		WebElement clsbtn = driver.findElement(By.xpath("//span[@class='select2-selection__choice__remove']"));
		JavascriptExecutor cb = (JavascriptExecutor)driver;
		cb.executeScript("arguments[0].click()", clsbtn);
//   	driver.findElement(By.xpath("//span[@class='select2-selection__choice__remove']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("select2-search_1-result-wjuh-2")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search_name_1")).sendKeys("search_name_1");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
