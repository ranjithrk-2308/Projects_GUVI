package Tests;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;
import Pages.Deletingitemincart;

public class TC_006_DeletingItemFromCart_TestCase extends DemoBlazeSpecs{

	
	@Test (priority = 6)
	public void deletingitemtestCase() throws IOException, InterruptedException {
		
		ClickNavigationDemoBlaze cartclick = new ClickNavigationDemoBlaze();
		
		cartclick.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cartclick.clickingcart();
		Deletingitemincart delete = new Deletingitemincart();
		delete.calculatingcartamount()
		.deletingitemincart()
		.verifyamountincart();
	}
	
}
