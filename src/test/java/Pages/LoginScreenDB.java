package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.DemoBlazeSpecs;

public class LoginScreenDB extends DemoBlazeSpecs{


	public LoginScreenDB loginusername (String lusername) {
		driver.findElement(By.id("loginusername")).sendKeys(lusername);
		return this;
	}
	public LoginScreenDB loginpassword (String lpassword) {
		driver.findElement(By.id("loginpassword")).sendKeys(lpassword);
		return this;
	}
	
	public LoginScreenDB loginbuttonclick () {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		return this;
	}
	
	public LoginScreenDB loginbuttoncheck () throws InterruptedException {
		Thread.sleep(2000);
		String expected = "Log in";
		String actual =	driver.findElement(By.xpath("//a[@id='login2']")).getText();
		System.out.println(actual);
		
		if (expected.equals(actual)) {
			System.out.println("Login button is visible : ");
		}else {
			System.out.println("Login Button is not visible : ");
		}
		return this;
	}

	public LoginScreenDB switchtodash () throws InterruptedException {
		Thread.sleep(2000);
		String expected = "Welcome ranjith2308";
		String actual = driver.findElement(By.xpath("//a[text()='Welcome ranjith2308']")).getText();
		System.out.println(actual);
		
		if (actual.equals(expected)) {
			System.out.println("Logged Successfully : ");
		}else {
			System.out.println("Logged not Successfully : ");

		}
		return this;
	}
	
	public LoginScreenDB WelcomeuserCheck () throws InterruptedException {
		
		Thread.sleep(3000);
		String expected = "Welcome ranjith2308";
		String actual = driver.findElement(By.xpath("//a[text()='Welcome ranjith2308']")).getText();
		System.out.println(actual);

		
		if (actual.equals(expected)) {
			System.out.println("Logged Successfully : ");
		}else {
			System.out.println("Logged not Successfully : ");
		}
		return this;
	}
}
