package com.EmailWatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://winserv2012.datafabricx.com/Mailscheduler/EmailWatcher.WebApp/Home/");
		
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
		
		try {
		driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
        System.out.println("alertText");
		
		
		
		
//		driver.findElement(By.id("profileName")).sendKeys("Mail 1");
        
		
		
        try {
//		driver.findElement(By.xpath("//input[@placeholder='Profile Name']")).sendKeys("new");
        	WebElement wid = driver.findElement(By.id("addWidgetBtn"));
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
    		jse1.executeScript("arguments[0].click()", wid);
        }catch(UnhandledAlertException f) {
        	
        }
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("noMails")).sendKeys("22");
		
		Thread.sleep(2000);
		
	
		}

        driver.findElement(By.xpath("//button[@class='btn btn-icon btn-icon-end btn-outline-primary btn-next']")).click();
		
		Thread.sleep(2000);
}
}
