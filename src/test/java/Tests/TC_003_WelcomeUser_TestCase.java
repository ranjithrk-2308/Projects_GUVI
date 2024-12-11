package Tests;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_003_WelcomeUser_TestCase extends DemoBlazeSpecs {
	@Test
	public void welcomecheck () throws InterruptedException {
		
		ClickNavigationDemoBlaze welcome = new ClickNavigationDemoBlaze();
		
		welcome.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick()
		.WelcomeuserCheck();
	}
}