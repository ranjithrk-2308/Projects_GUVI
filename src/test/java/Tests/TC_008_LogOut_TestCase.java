package Tests;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_008_LogOut_TestCase extends DemoBlazeSpecs{

	
	@Test (priority = 6)
	public void LogOutTestCase () throws IOException, InterruptedException {
		
		ClickNavigationDemoBlaze logout = new ClickNavigationDemoBlaze();
		logout.loginclick()
		
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick();
		logout.sleepforlogout()
		.logoutcheck()
		.logoutclick();
	}
}
