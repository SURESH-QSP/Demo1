package org.suri.FrameworkPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class enterTimeTrack 
{
	public enterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void isVerified(WebDriver driver, long ETO, String title)
	{
		try {
			WebDriverWait w = new WebDriverWait(driver,ETO);
			w.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is Displayed", true);
		} 
		catch (Exception e)
		{
			Reporter.log("Home page is not dispalyed", true);
			e.printStackTrace();
		}
	}
}
