package com.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationApplications 
{

	WebDriver driver=null;
	

	@BeforeClass
	public void launchBrowser()
	{
		
			String strdriverpath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.driver.chrome", strdriverpath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		
	}
	
	@Test
	public void navigateUrl()
	{
		driver.get("https://www.guru99.com/software-testing.html");
	}
	
	
	public void sample()
	{
		System.out.println("Hello Sample");
	}
	
	

}
