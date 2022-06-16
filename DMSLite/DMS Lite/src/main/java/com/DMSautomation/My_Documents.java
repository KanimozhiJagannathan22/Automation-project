package com.DMSautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_Documents {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://winserv2012.datafabricx.com/DFXDMSLite/DFXWebApp/Home/");
		
		driver.findElement(By.linkText("DMS")).click();	
		
		Thread.sleep(2000);
		
		WebElement mydoc = driver.findElement(By.xpath("(//span[@class='sidemenu-label'])[2]"));
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
		j1.executeScript("arguments[0].click()", mydoc);
//      driver.findElement(By.linkText("My Documents")).click();
//		driver.findElement(By.xpath("(//span[@class='sidemenu-label'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement GB = driver.findElement(By.id("categoryMenuName"));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
//		driver.findElement(By.id("categoryMenuName")).click();
		
		Thread.sleep(2000);
		
		WebElement CC = driver.findElement(By.id("btnCustomiseColList"));
		JavascriptExecutor j2 = (JavascriptExecutor)driver;
		j2.executeScript("arguments[0].click()", CC);
//		driver.findElement(By.id("btnCustomiseColList")).click();
		
		Thread.sleep(2000);

		WebElement cc1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));	
		Actions action1 = new Actions(driver);		
	    action1.sendKeys(cc1, "C").perform();
	    action1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		action1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Apply")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class='dtr-control']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='fas fa-times']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnReportMenu")).click();
		
		Thread.sleep(2000);
		
//		WebElement dd = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));	
//		Actions action2 = new Actions(driver);		
//	    action2.sendKeys(cc1, "Ch").perform();
//	    action2.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		action2.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		action2.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
		
		driver.findElement(By.id("downloadReportType")).click();
		
		driver.findElement(By.xpath("//option[@value='Excel']")).click();
	    
	    Thread.sleep(2000);
	
	    driver.findElement(By.linkText("Download")).click();
		
		Thread.sleep(2000);
		
		
	    
		
//				driver.close();
	}

}
