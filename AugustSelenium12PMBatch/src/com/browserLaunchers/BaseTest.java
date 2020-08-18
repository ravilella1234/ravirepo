package com.browserLaunchers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	public static String projectPath = System.getProperty("user.dir");
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath + "//data.properties" );
		 p = new Properties();
		 p.load(fis);
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath +"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	
	public static void navigateUrl(String url)
	{
		driver.get(p.getProperty(url));
	}

}
