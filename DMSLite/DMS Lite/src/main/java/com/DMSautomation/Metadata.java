package com.DMSautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metadata {

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
		
		Thread.sleep(2000);
		
		WebElement file =driver.findElement(By.xpath("(//tr[@role='row'])[2]"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click()", file);
		
		Thread.sleep(2000);
		
		WebElement md =driver.findElement(By.id("base-tab"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click()", md);
//		driver.findElement(By.id("base-tab")).click();
		
		Thread.sleep(2000);		
		
		driver.close();
		
	}
	
}
