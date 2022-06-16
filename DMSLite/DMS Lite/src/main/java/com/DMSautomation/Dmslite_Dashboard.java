package com.DMSautomation;
	
	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Dmslite_Dashboard {
		
		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://winserv2012.datafabricx.com/DFXDMSLite/DFXWebApp/Home/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("DMS")).click();
			
			Thread.sleep(2000);
			
//			driver.findElement(By.linkText("Dashboard")).click();
//			
//			Thread.sleep(2000);
			
			WebElement dashbrdlb = driver.findElement(By.id("dashboardListBtn"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", dashbrdlb);
			
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("Test")).click();
			
			Thread.sleep(5000);
			
//			driver.findElement(By.linkText("Add new Dashboard")).click();
//			 
//			Thread.sleep(2000);
//			
//			driver.findElement(By.id("dashboardName")).sendKeys("Test");
//			
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
					
			WebElement wid = driver.findElement(By.id("addWidgetBtn"));
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("arguments[0].click()", wid);
			
//			driver.findElement(By.xpath("//a[@class='addbtn']")).click();
			
			Thread.sleep(2000);
						
		    driver.findElement(By.id("countWidgetTextSample")).sendKeys("Test01");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("countWidgetDescSample")).sendKeys("Sample");
			
			Thread.sleep(2000);
			
			WebElement cache = driver.findElement(By.id("countInternalSample"));
			
			cache.clear();
			
			cache.sendKeys("150");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='search']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);;
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("search_entryid_1")).sendKeys("201");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@onclick='testWidget()']")).click();
			
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@class='btn btn-primary mr-1']")).click();
		    
		    Thread.sleep(10000);
		  
			driver.close();
			
			
			
		}

	}




