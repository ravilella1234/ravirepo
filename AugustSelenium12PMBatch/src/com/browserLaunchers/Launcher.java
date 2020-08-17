package com.browserLaunchers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launcher 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AugustDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.setProperty("webdriver.gecko.driver", "D:\\AugustDrivers\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.flipkart.com");
		
		//webdriver.edge.driver
		//webdriver.ie.driver

	}

}
