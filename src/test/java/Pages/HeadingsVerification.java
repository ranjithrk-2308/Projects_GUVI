package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.DemoBlazeSpecs;

public class HeadingsVerification extends DemoBlazeSpecs{
	
	public HeadingsVerification (WebDriver driver) {
		this.driver=driver;
	}
	
	// Verifying the headings using methods
	public HeadingsVerification contactcheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Contact']")).getText();
		String expectedtext = "Contact";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("Contact heading is visible : ");
		} else {
			System.out.println("Contact heading is missing : ");
		}
		return this;
	}
	
	public HeadingsVerification HomeCheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Home ']")).getText();
		String expectedtext = "Home ";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("Home heading is visible : ");
		} else {
			System.out.println("Home heading is missing : ");
		}
		return this;
	}
	public HeadingsVerification LogoutCheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
		String expectedtext = "Log out";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("LogOut heading is visible : ");
		} else {
			System.out.println("LogOut heading is missing : ");
		}
		return this;
	}
	
	public HeadingsVerification PhoneCheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Phones']")).getText();
		String expectedtext = "Phones";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("Phones Categories is visible : ");
		} else {
			System.out.println("Phones Categories is missing : ");
		}
		return this;
	}
	public HeadingsVerification LaptopCheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Laptops']")).getText();
		String expectedtext = "Laptops";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("Laptops Categories is visible : ");
		} else {
			System.out.println("Laptops Categories is missing : ");
		}
		return this;
	}
	public HeadingsVerification MonitorCheck () {
		String actualtext = driver.findElement(By.xpath("//a[text()='Monitors']")).getText();
		String expectedtext = "Monitors";
		
		if (actualtext.equals(expectedtext)) {
			System.out.println("Monitor Categories is visible : ");
		} else {
			System.out.println("Monitor Categories is missing : ");
		}
		return this;
	} 
	
	public void logocheck () {
		WebElement ele = driver.findElement(By.xpath("//a[@id='nava']"));
		String cssvaluestyle = ele.getCssValue("font-style");
		String actualstyle = "normal";
		
		System.out.println("The CSSValue sytle of rht elogo is "+cssvaluestyle);
		
		
		if (cssvaluestyle.equals(actualstyle)) {
			System.out.println("The logo is present : ");
		}
	}
}
