package Tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_001_SignUpButtonCheck_TestCase extends DemoBlazeSpecs {
	
	@Test (priority = 2)
	public void signupbuttonchecktestcase () throws InterruptedException {
		
	ClickNavigationDemoBlaze signup = new ClickNavigationDemoBlaze();
	signup.signupbutton()
	.singupbuttonchcek();
	
	}
}
