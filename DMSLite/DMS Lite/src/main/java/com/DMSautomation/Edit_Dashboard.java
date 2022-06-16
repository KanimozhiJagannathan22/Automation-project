package com.DMSautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Dashboard {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://winserv2012.datafabricx.com/DFXDMSLite/DFXWebApp/Home/");
		
		driver.findElement(By.linkText("DMS")).click();
		
//		driver.findElement(By.id("dashboardListBtn")).click();
		
		Thread.sleep(2000);
		
		WebElement dashbrdlb = driver.findElement(By.id("dashboardListBtn"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", dashbrdlb);
		
		Thread.sleep(5000);
				
		WebElement clkwid = driver.findElement(By.linkText("Test"));
		JavascriptExecutor jsex = (JavascriptExecutor)driver;
		jsex.executeScript("arguments[0].click()", clkwid);
//		driver.findElement(By.linkText("Test")).click();
		
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("editDashboard")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(2000); 
		
		WebElement desc = driver.findElement(By.id("countWidgetDescSample"));
		desc.clear();
		desc.sendKeys("dataset");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@onclick='openSetupWidget(1,3)']")).click();
		
		Thread.sleep(2000);
		
		WebElement txtfrm = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		
		Actions action = new Actions(driver);
		
		   action.sendKeys(txtfrm, "te").perform();
		   
		   Thread.sleep(2000);
		   
		   action.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   Thread.sleep(2000);
		   
           action.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   Thread.sleep(2000);
		   
		   action.sendKeys(Keys.ENTER).perform();
		 
		   Thread.sleep(2000);
		   
		   driver.findElement(By.id("select2-search_Template_1-container")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.id("select2-search_Template_1-result-izkt-11")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@class='btn btn-default mr-1']")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@class='btn btn-primary mr-1']")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@onclick='testWidget()']")).click();
			
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@class='btn btn-primary mr-1']")).click();
		    
		    Thread.sleep(10000);
		
		driver.close();
		
	}
	
	

}
