package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;
import Pages.ProductsSwitchScreen;

public class TC_004_AddProductToCart_Test extends DemoBlazeSpecs {
@Test  (priority = 3)
	public  void  addsonylaptocartTestcase () throws  InterruptedException {
		
		ClickNavigationDemoBlaze addtocart = new ClickNavigationDemoBlaze();
		addtocart.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick();
		
		Thread.sleep(3000);
		
		addtocart.productclick()
		.addtocart();
		}
}
