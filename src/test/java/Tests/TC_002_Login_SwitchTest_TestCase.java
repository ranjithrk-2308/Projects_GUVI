package Tests;
import org.testng.annotations.Test;

import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;
import Pages.LoginScreenDB;

public class TC_002_Login_SwitchTest_TestCase extends DemoBlazeSpecs{
	@Test (priority = 4)
	public void switchtestTestCase () throws InterruptedException {
		
		ClickNavigationDemoBlaze switchtest = new ClickNavigationDemoBlaze();
		
		switchtest.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick()
		.switchtodash();
	}
}