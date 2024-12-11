package Tests;
import java.io.IOException;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_003_HeadingsCheckTest extends DemoBlazeSpecs{
	
	@Test (priority = 3)
	public void headingchecktestcase () throws IOException {
		
	ClickNavigationDemoBlaze headDB = new ClickNavigationDemoBlaze();
	headDB.loginclick()
	.loginusername(prop.getProperty("lusername"))
	.loginpassword(prop.getProperty("lpassword"))
	.loginbuttonclick();
	headDB.loginverification()
	.contactcheck()
	.HomeCheck()
	.LogoutCheck()
	.PhoneCheck()
	.LaptopCheck()
	.MonitorCheck()
	.logocheck();
	}
}
