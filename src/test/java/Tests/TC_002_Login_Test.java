package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_002_Login_Test extends DemoBlazeSpecs{
	
		@Test (priority = 5)
		
		public void LoginTestCase002 () throws IOException {
			
			ClickNavigationDemoBlaze LoginDB = new ClickNavigationDemoBlaze();
			
			LoginDB.loginclick()
			.loginusername(prop.getProperty("lusername"))
			.loginpassword(prop.getProperty("lpassword"))
			.loginbuttonclick();
		}
}
