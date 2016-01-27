package com.biz.jnc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest
{
	public static WebDriver driver;
	public static Actions actions;
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.cssSelector("b.ico.ico-logo.ico-logo-163")).click();
		driver.findElement(By.id("userNameIpt")).clear();
		driver.findElement(By.id("userNameIpt")).sendKeys("LanceLeeTest");
		driver.findElement(By.id("pwdInput")).clear();
		driver.findElement(By.id("pwdInput")).sendKeys("lscheng*901130");
		driver.findElement(By.id("btnSubmit")).click();
		
	}

	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "res\\driver\\chrome\\win\\chromedriver.exe");
	    driver = new ChromeDriver();
		actions = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://email.163.com/");
	}

	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}
