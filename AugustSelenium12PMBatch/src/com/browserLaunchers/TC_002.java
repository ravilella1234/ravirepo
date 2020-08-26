package com.browserLaunchers;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectItem("amazondropbox_id","Books");
		
		type("amazonsearchtext_id","Harry potter");
		
		elementClick("amazonsearchbutton_xpath");
				
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		
		//driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input']")).click();

	}

	
}
