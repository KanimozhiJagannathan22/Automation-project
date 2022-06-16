package com.EmailWatcher;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EmailWatcher {

	    public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://winserv2012.datafabricx.com/Mailscheduler/EmailWatcher.WebApp/Home/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='card hover-scale-up cursor-pointer sh-19']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("emailUrl")).sendKeys("https://outlook.dfx.local:444/EWS/Exchange.asmx");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("emailID"));
		
		email.clear();
		
		email.sendKeys("jkanimozhi@dfx.local");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("emailPassword"));
		
		password.clear();
		
		password.sendKeys("P@ssw0rd");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm mt-2']")).click();
		
		Thread.sleep(3000);
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e) {
			System.out.println("Test connection successfull");
		}
		
		Thread.sleep(2000);	
	
		driver.findElement(By.xpath("//input[@placeholder='Profile Name']")).sendKeys("New Version");
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("noMails")).sendKeys("22");
	
         Thread.sleep(4000);	
         
         WebElement btn = driver.findElement(By.xpath("(//button[@Type='button'])[2]"));
         JavascriptExecutor j1 = (JavascriptExecutor) driver;
         j1.executeScript("arguments[0].click()",btn);
         
// NEW RULE
         
         Thread.sleep(2000);
         
         driver.findElement(By.linkText("Add New Rule")).click();
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("ruleName")).sendKeys("Targeted Mails");

         Thread.sleep(2000);
         
         driver.findElement(By.id("fromEmail")).click();
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("fromEmailFilter")).sendKeys("skarthic@dfx.local");
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("subjectEmail")).click();
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("subjectEmailFilter")).sendKeys("Version 1.0");
         
         Thread.sleep(2000);
         
//         driver.findElement(By.partialLinkText("\r\n"
//         		+ "                        Save\r\n"
//         		+ "                    ")).click();
         
         driver.findElement(By.xpath("(//a[@class='btn btn-outline-secondary btn-sm'])[2]")).click();
         
         Thread.sleep(2000);
         
//         driver.findElement(By.xpath("(//a[@class='btn btn-outline-secondary btn-sm'])[2]"));
//         
//         Thread.sleep(2000);
//         
//         driver.findElement(By.id("repo")).click();
//         
//         Thread.sleep(2000);
//         
//         driver.findElement(By.id("//option[@value='DEMOREPO']")).click();
//         
//         Thread.sleep(2000);
//         
//         driver.findElement(By.xpath("(//a[@class='btn btn-outline-secondary btn-sm'])[3]")).click();
//         
//         Thread.sleep(2000);
         
         WebElement btn1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
         JavascriptExecutor j2 = (JavascriptExecutor) driver;
         j2.executeScript("arguments[0].click()",btn1);
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("storetodms")).click();
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("dfxURL")).sendKeys("http://winserv2012.datafabricx.com/DFXDMSLite/dfxapi");
         
         Thread.sleep(2000);
         
         driver.findElement(By.linkText("Test Url")).click();
         
         Thread.sleep(2000);
         
         try {
  			Alert alert=driver.switchTo().alert();
  			alert.accept();
  		}catch(NoAlertPresentException e) {
  			System.out.println("URL accessible");
  		}
          
         Thread.sleep(3000);
         
         driver.findElement(By.id("both")).click();
         
         Thread.sleep(2000);
         
         WebElement btn2 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
         JavascriptExecutor j3 = (JavascriptExecutor) driver;
         j3.executeScript("arguments[0].click()",btn2);
                  
         Thread.sleep(2000);
         
//File settings
         
         driver.findElement(By.id("markasred")).click();
         
         Thread.sleep(2000);
         
//File After Processing
         
         driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
         
// click here to save
         
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//a[@class='btn btn-primary mt-3']")).click();        
         
         Thread.sleep(2000);
         
         try {
   			Alert alert=driver.switchTo().alert();
   			alert.accept();
   		}catch(NoAlertPresentException e) {
   			System.out.println("Created successfully");
   		}
         
         Thread.sleep(3000);         
         
		
	}
}
