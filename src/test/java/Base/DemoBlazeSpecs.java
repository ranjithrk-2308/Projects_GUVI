package Base;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utilities.UtilitiesDemoBlaze;

public class DemoBlazeSpecs extends UtilitiesDemoBlaze {
	@BeforeMethod
	public void DemoBlazeLaunch () {
		browserOpen();
	}
	@AfterMethod
	public void DemoBlazeClose () {
		browserClose();
	}
	
	public void waitMethod() {
		browserWait();
	}
	@BeforeSuite
	public void fileread () throws IOException {
		readfile();
	}
}
