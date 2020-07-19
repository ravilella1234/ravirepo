package parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RunParallel 
{
	static String browser="chrome";
	
	
	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName(browser);

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
			driver=new RemoteWebDriver(new URL("http://192.168.1.9:4444/wd/hub"), cap);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://www.amazon.in");
		

	}

}
