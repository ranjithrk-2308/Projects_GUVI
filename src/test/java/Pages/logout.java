package Pages;

import org.openqa.selenium.By;
import Base.DemoBlazeSpecs;

public class logout extends DemoBlazeSpecs{
	String actualtext;
	String expectedtext = "Log out";
	public logout logoutcheck ()   {
		
		actualtext = driver.findElement(By.id("logout2")).getText();
		System.out.println(actualtext);
		if (expectedtext .equals(actualtext)) {
			System.out.println("The text is matching : ");
		}else {
			System.out.println("The text is not matching");
		}
		return this;
	}
	
	public logout logoutclick () {
		driver.findElement(By.id("logout2")).click();
		return this;
	}

}
