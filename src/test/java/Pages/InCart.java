package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.DemoBlazeSpecs;

public class InCart extends DemoBlazeSpecs{
	
	public void InCart (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public InCart placeorderbutton () {
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		return this;
	}
	
	

}
