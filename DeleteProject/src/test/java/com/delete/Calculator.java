package com.delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\core java classes\\Softwares\\Selenium\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
}
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
		.sendKeys("QQQQQ");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("qqqqq");
		
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		System.out.println("Login successfully");
	}
}
