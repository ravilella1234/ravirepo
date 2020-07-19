package base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DemoClass 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//anc.png"));

	}

}
