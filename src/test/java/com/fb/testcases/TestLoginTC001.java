package com.fb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fb.pom.LoginFB_POM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginTC001 extends BaseClass{
	@Test	
	public void testLoginFB() throws Exception
	{	
		LoginFB_POM login=new LoginFB_POM(driver);		
		login.setUser(emailMobile);
		Thread.sleep(1000);
		login.setPassword(password);
		Thread.sleep(1000);	
		login.performClick();
		Thread.sleep(3000);	
//		WebElement email=driver.findElement(By.xpath(""));
//		email.sendKeys("bugspotter@test.com");
//		Thread.sleep(1000);	
//		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
//		password.sendKeys("1234");
//		Thread.sleep(1000);
//		WebElement login=driver.findElement(By.xpath(""));
//		login.click();
//		Thread.sleep(3000);		
	}
	

}
