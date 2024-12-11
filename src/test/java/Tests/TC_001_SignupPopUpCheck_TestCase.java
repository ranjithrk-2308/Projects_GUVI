package Tests;

import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.SignupButtonCheck;

public class TC_001_SignupPopUpCheck_TestCase extends DemoBlazeSpecs{
@Test	 (priority = 3)
	public void opupcheckTestCase () throws InterruptedException {
		
		SignupButtonCheck popup = new SignupButtonCheck();
		
		popup.Signuppopupcheck()
		.popupcheck();
	}

}
