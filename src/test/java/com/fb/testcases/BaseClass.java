package com.fb.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.fb.utility.ConfigDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;	
	ConfigDataReader read=new ConfigDataReader();
	String url=read.getURL();
	String emailMobile=read.getEmailOrMobile();
	String password=read.getPassword();
	@Parameters("browser")
	@BeforeTest	
	public void openBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}	
	}
	@AfterTest	
	public void closeBrowser()
	{
		driver.close();
	}
	
}
