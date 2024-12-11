package Tests;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_001_SignUp_Test extends DemoBlazeSpecs{
	
@Test (priority = 1)
	public  void SignUpTestCase001() throws IOException {
	
	ClickNavigationDemoBlaze DB = new ClickNavigationDemoBlaze();
	DB.SignUpClick()
	.Username(prop.getProperty("username"))
	.password(prop.getProperty("password"))
	.signupbutton()
	.DemoBlazeClose();
	
	}
}
