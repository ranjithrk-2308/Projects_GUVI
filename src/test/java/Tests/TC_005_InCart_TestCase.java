package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.DemoBlazeSpecs;
import Pages.ClickNavigationDemoBlaze;

public class TC_005_InCart_TestCase extends DemoBlazeSpecs{

	@Test (priority =5)
	public void IncartTC () throws IOException, InterruptedException {
		
		
		ClickNavigationDemoBlaze incart = new ClickNavigationDemoBlaze();
		incart.loginclick()
		.loginusername(prop.getProperty("lusername"))
		.loginpassword(prop.getProperty("lpassword"))
		.loginbuttonclick();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		incart.clickingcart()
		.DemoBlazeClose();
		
	}
}
