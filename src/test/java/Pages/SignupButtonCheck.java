package Pages;

import org.openqa.selenium.By;
import Base.DemoBlazeSpecs;
import Tests.TC_001_SignUpButtonCheck_TestCase;

public class SignupButtonCheck extends DemoBlazeSpecs {
	
	public SignupButtonCheck singupbuttonchcek () throws InterruptedException {
		
		Thread.sleep(2000);
		String expected = "Sign up";
		String signup = driver.findElement(By.xpath("//a[@id='signin2']")).getText();
		
		System.out.println("Test"+signup);
		//Checking the Sign up button
		if (signup.equals(expected)) {
			System.out.println("The Sign up button is visible : ");
		}else {
			System.out.println("The Sign jp button is not visible : ");
		}
		return this;
	}
	
	public SignupButtonCheck Signuppopupcheck () {
		driver.findElement(By.xpath("//a[@id='signin2']")).click();
		return this;
	}
	public SignupButtonCheck popupcheck () throws InterruptedException {
		Thread.sleep(2000);
		String expected = "Sign up";
		String actual =	driver.findElement(By.xpath("//button[text()='Sign up']")).getText();
		System.out.println(actual);
		if (actual.equals(expected)) {
			System.out.println("The pop up screen is present : ");
		}
		else {
			System.out.println("The pop up screen is not present : ");
		}
		return this;
	}			
}
