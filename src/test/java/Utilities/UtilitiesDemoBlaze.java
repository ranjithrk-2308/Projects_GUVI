package Utilities;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.api.model.Driver;
import com.google.protobuf.Option;

public class UtilitiesDemoBlaze {
	
	ChromeOptions chrome = new ChromeOptions();
	//chrome.addArguments("--remote-allow-origins=*");
	
	public static WebDriver driver ;
	public static Properties  prop;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testname, testdescription, testauthor;
	
	public void browserOpen () {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void browserClose() {
		driver.close();
	}
	
	public void browserWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void readfile () throws IOException {
		FileReader file = new FileReader("C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\MiniProject1DemoBlaze\\src\\test\\resources\\testData.properties");
		prop = new Properties();
		prop.load(file);
	}
	/*
	 * @Ignore
	 * 
	 * @BeforeSuite public void reportinitialization () { // To Create report in the
	 * given location: String reportpath =
	 * "\"C:\\\\Users\\\\ralaguchamy\\\\OneDrive - IGT PLC\\\\Desktop\\\\Learning\\\\Eclipse 9  9 2024\\\\MiniProject1DemoBlaze\\\\test-output\\\\Reports\\\\MiniProject01\""
	 * ; ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
	 * reporter.config().setReportName("DemoBlaze Report");
	 * 
	 * // Capture test data and store in report : extent = new ExtentReports();
	 * extent.attachReporter(reporter); }
	 * 
	 * @Ignore
	 * 
	 * @BeforeClass (enabled = false) public void testdetails () {
	 * test=extent.createTest(testname); }
	 */
}
