package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomliquids.ChildpopUp;

public class TestNG1st {
	private WebDriver driver;
	private ChildpopUp childpopUp;

	@BeforeSuite
	public void beforesuit() {
		System.out.println();
	}

	@BeforeTest 
	@Parameters("browser")             // it is used to launch the browser
	public void launchBrowser(String browserName) {
		System.out.println(browserName);
	    if(browserName.equals("Chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Silenium\\New path\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://livingliquidz.com/");
	    }
	    
	    if(browserName.equals("Edge"))
	    {
	    	System.setProperty("webdriver.edge.driver","G:\\Velocity\\path of edge\\msedgedriver.exe");
	    	driver=new EdgeDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://livingliquidz.com/");
	    }
		

	}                        
	

	

	@BeforeClass // it is used to create the object
	public void beforeclass() {
		childpopUp = new ChildpopUp(driver);
		System.out.println();
	}

	@BeforeMethod // it is used to execute the repeated code before test
	public void beforemethod() {
		driver.get("https://livingliquidz.com/");
		System.out.println();
	}

	@Test // actual test cases is been written here
	public void test() throws InterruptedException {
		childpopUp.clickOnGoogle();
		System.out.println();
	}

	@AfterMethod                // it is used to execute the repeated code after test
	public void aftermethod() {
		driver.navigate().back();
		System.out.println();
	}

	@AfterClass // it is used to delete the object
	public void afterclass() {
		childpopUp =null;
		driver=null;
		
		System.out.println();
	}

	@AfterTest // it is used to close the browser
	public void aftertest() {
		driver.quit();
		System.gc();
		System.out.println();
	}

	@AfterSuite // it is used to call garbage collection
	public void aftersuite() {
		System.out.println();
	}
}
