package Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.DemoBlazeSpecs;

public class ClickNavigationDemoBlaze extends DemoBlazeSpecs {
	
	public void ClickNavigationDemoBlaze (WebDriver driver) {
		this.driver=driver;
	}
	// Return to Sign up button Check :
	
	public SignupButtonCheck signupbutton () {
		return new SignupButtonCheck();
	}
	
	// Return to Sign up Screen 
	public SignUpScreenDemoBlaze SignUpClick() {
		driver.findElement(By.id("signin2")).click();
		return new SignUpScreenDemoBlaze();
	}
	//Return to login screen
	
	public LoginScreenDB loginclick() {
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		return new LoginScreenDB();
	}
	// After Execution this method return the Heading verification method
	
	public HeadingsVerification loginverification () {
			
		String afterlogintext = "Welcome ranjith2308";
		String actualtext  = driver.findElement(By.xpath("//a[text()='Welcome ranjith2308']")).getText();
		System.out.println(actualtext);
			
		if (afterlogintext.equals(actualtext)) {
			System.out.println("Logged in Successfully : ");
		}else {
			System.out.println("Login failed : ");
	}
		return new HeadingsVerification(driver);
	}
	public ProductsSwitchScreen productclick () throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		Thread.sleep(3000);
		
		return new ProductsSwitchScreen(driver);
	}
	public ClickNavigationDemoBlaze clickingcart () throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		return this;
	}
	
	public PlaceOrderScreen clicktoplaceorder () throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		return new PlaceOrderScreen();
	}
	
	public logout sleepforlogout () throws InterruptedException {
		Thread.sleep(3000);
		return new logout();
	}
	
}