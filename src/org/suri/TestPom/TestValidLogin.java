package org.suri.TestPom;

import org.suri.FrameworkPom.enterTimeTrack;
import org.suri.FrameworkPom.loginPage;
import org.suri.GenericMethods.BaseTest;
import org.suri.GenericMethods.XL;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest
{
	@Test
	public void testValidate()
	{
		String un = XL.getData(xlpath, "sheet1", 1, 0);
		String pwd = XL.getData(xlpath, "sheet1", 1, 1);
	    
		/*String un1 = XL.getData(xlpath, "sheet1", 2, 0);
		String pwd1 = XL.getData(xlpath, "sheet1", 2, 1);*/
		
		loginPage lp = new loginPage(driver);
		lp.getUserName(un);
		lp.getPassword(pwd);
		lp.login();
		
		
		enterTimeTrack tt = new enterTimeTrack(driver);
		tt.isVerified(driver, 10, "title");
		
		
	}
}
