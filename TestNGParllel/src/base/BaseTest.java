package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest 
{
	public static WebDriver driver; 
	public static DesiredCapabilities cap=null;
		
	
	public static void openBrowser(String browser) throws MalformedURLException
	{
		
		if(browser.equalsIgnoreCase("Mozilla"))
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\Browser_Drivers\\geckodriver.exe");
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("Mozilla");
			cap.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), cap);
			
			/*FirefoxOptions opt=new FirefoxOptions();
			opt.merge(cap);
			try {
				driver=new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), opt);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName(browser);
			cap.setPlatform(Platform.WIN10);
			//driver=new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), cap);
			
			ChromeOptions opt=new ChromeOptions();
			opt.merge(cap);	
			try {
				driver=new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), opt);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(browser.equalsIgnoreCase("IE")) 
		{
			//System.setProperty("webdriver.ie.driver", "D:\\Browser_Drivers\\IEDriverServer.exe");
			cap=DesiredCapabilities.internetExplorer();		
			cap.setBrowserName(browser);
			cap.setJavascriptEnabled(true);
			cap.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), cap);
			
			/*InternetExplorerOptions opt=new InternetExplorerOptions();
			opt.merge(cap);
			try {
				driver=new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), opt);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		driver.get("https://www.amazon.in");
		
	}
	
	@AfterMethod
	public void endMethod() 
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}

