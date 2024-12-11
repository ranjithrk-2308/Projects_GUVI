package Pages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import Base.DemoBlazeSpecs;
import Utilities.UtilitiesDemoBlaze;

public class SignUpScreenDemoBlaze extends DemoBlazeSpecs{
	
	public void SearScreen  (WebDriver driver) {
		this.driver=driver;
	}
	
	public  SignUpScreenDemoBlaze Username (String username) {
		driver.findElement(By.id("sign-username")).sendKeys(username);
		return this;
	}
	public  SignUpScreenDemoBlaze password (String password) {
		driver.findElement(By.id("sign-password")).sendKeys(password);
		return this;
	}
	public  SignUpScreenDemoBlaze signupbutton () {
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		return this;
	}
}
