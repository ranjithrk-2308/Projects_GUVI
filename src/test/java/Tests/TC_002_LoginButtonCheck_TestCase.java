package Tests;
import org.testng.annotations.Test;
import Base.DemoBlazeSpecs;
import Pages.LoginScreenDB;

public class TC_002_LoginButtonCheck_TestCase extends DemoBlazeSpecs {
	
@Test (priority = 6) 
	public void loginbuttoncheck () throws InterruptedException {
		
		LoginScreenDB login = new LoginScreenDB();
		login.loginbuttoncheck();
	}
}
