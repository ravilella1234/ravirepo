package verifications;

import com.browserLaunchers.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_006");
		test.log(LogStatus.INFO, " ***********************   TC_006 Started  *************************");
		test.log(LogStatus.INFO, "Initializing the Properties files...");
		
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigating the Url : " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "New Releases";
		
		if(!isElementPresent(expectedLink))
			reportFailure("Both links are not eqaul..");
		else 
			reportSuccess("Both links are eqaul...");
		
		report.endTest(test);
		report.flush();
	}

}
