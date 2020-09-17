package verifications;

import org.openqa.selenium.By;

import com.browserLaunchers.BaseTest;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
				
		navigateUrl("amazonurl");
		
		//String actualLink = driver.findElement(By.linkText("New Releases")).getText();
		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		String expectedLink = "New Release";
		
		System.out.println("ActaulLink : " + actualLink);
		System.out.println("ExpectedLink :" + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");
		

	}

}
