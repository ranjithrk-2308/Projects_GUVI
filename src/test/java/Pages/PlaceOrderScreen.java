package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.DemoBlazeSpecs;

public class PlaceOrderScreen extends DemoBlazeSpecs{
	
	public PlaceOrderScreen placeorderbutton () {
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		return this;
	}
	public PlaceOrderScreen placeorderdetails (String pname,String  pcountry, String pcity, String pcreditcard,String pmonth,String pyear) {
		
		driver.findElement(By.id("name")).sendKeys(pname);
		driver.findElement(By.id("country")).sendKeys(pcountry);
		driver.findElement(By.id("city")).sendKeys(pcity);
		driver.findElement(By.id("card")).sendKeys(pcreditcard);
		driver.findElement(By.id("month")).sendKeys(pmonth);
		driver.findElement(By.id("year")).sendKeys(pyear);
		return this;
	}
	public PlaceOrderScreen purchaseclick() {
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		return this;
	}
}
