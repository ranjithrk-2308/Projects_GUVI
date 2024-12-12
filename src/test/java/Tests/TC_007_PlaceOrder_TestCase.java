package Tests;

import java.io.IOException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_007_PlaceOrder_TestCase extends DemoBlazeSpecs{
	
	@Test (priority = 5)
	public void PlaceOrderTestCase () throws IOException, InterruptedException {
		
		
		ClickNavigationDemoBlaze placeorder = new ClickNavigationDemoBlaze();
		placeorder.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick();
		placeorder.clickingcart();
		placeorder.clicktoplaceorder()
		.placeorderbutton()
		.placeorderdetails(prop.getProperty("pname"), prop.getProperty("pcountry"), prop.getProperty("pcity"), prop.getProperty("pcreditcard"), prop.getProperty("pmonth"), prop.getProperty("pyear"))
		.purchaseclick();
			
	}
}
