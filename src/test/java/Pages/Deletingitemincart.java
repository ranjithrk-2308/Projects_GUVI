package Pages;

import org.openqa.selenium.By;
import Base.DemoBlazeSpecs;

public class Deletingitemincart extends DemoBlazeSpecs{
	
	String costbeforedelete;
	String costafterdelete;
	
	public Deletingitemincart calculatingcartamount () throws InterruptedException {
		Thread.sleep(3000);
		costbeforedelete = driver.findElement(By.xpath("//h3[@id='totalp']")).getText();
		System.out.println("The value of cart before deleting the item : " + costbeforedelete);
		return this;
	}
	
	public Deletingitemincart deletingitemincart () {
		driver.findElement(By.xpath("(//a[text()='Delete'])[2]")).click();
		return this;
	}
	
	
	public Deletingitemincart verifyamountincart () throws InterruptedException {
		Thread.sleep(3000);
		
		 costafterdelete = driver.findElement(By.xpath("//h3[@id='totalp']")).getText();
		 System.out.println("The value of the cart after deleting the item : " + costafterdelete);
		 
		if ( costbeforedelete != costafterdelete) {
			System.out.println("The amount is mismatching so the delete item is Successfull :");
		}else {
			System.out.println("The amount is matching so the delete item Did not happen :  ");
		}
		return this;
	}
}
