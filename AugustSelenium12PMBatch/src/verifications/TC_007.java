package verifications;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.browserLaunchers.BaseTest;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
				
		navigateUrl("amazonurl");
		
		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		String expectedLink = "New Release";
		
		System.out.println("ActaulLink : " + actualLink);
		System.out.println("ExpectedLink :" + expectedLink);
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
		
		driver.findElement(By.linkText("New Releases")).click();
		
		

	}

}
