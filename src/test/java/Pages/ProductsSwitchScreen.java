package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.DemoBlazeSpecs;

public class ProductsSwitchScreen extends DemoBlazeSpecs{
	
	public ProductsSwitchScreen (WebDriver driver) {
		this.driver=driver;
	}
	
	public ProductsSwitchScreen productconfirmation () {
	String expectednameoflap = "Sony vaio i7";
	String lapname = driver.findElement(By.xpath("//h2[@class='name']")).getText();
		if (expectednameoflap.equals(lapname)) {
			System.out.println("Correct laptop is selected ! ");
		}
		return this;
	}
	public ProductsSwitchScreen addtocart () {
		
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		
		//Alert alert = driver.switchTo().alert();
	//	alert.accept();
		return this;
	}
	

}
