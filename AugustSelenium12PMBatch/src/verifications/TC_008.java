package verifications;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.browserLaunchers.BaseTest;

public class TC_008 extends BaseTest
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
		
		SoftAssert s = new SoftAssert();
		//s.assertEquals(actualLink, expectedLink);
		s.assertTrue(actualLink.equals(expectedLink), "Both links are not equal..");
		
		s.assertTrue(false, "err1");
		
		s.assertTrue(false, "err2");
		
		s.assertTrue(true, "err3");
		
		s.assertTrue(false, "err4");
		
		driver.findElement(By.linkText("New Releases")).click();
		
		//s.assertAll();

	}

}
