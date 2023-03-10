package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomliquids.ChildpopUp;
import pomliquids.Homepage;

public class Platinum_test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Silenium\\New path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://livingliquidz.com/");
//		Homepage homepage = new Homepage(driver);
//		homepage.clickOnPlatinium();
		ChildpopUp childpopUp = new ChildpopUp(driver);
		childpopUp.clickOnGoogle();
		Thread.sleep(5000);
	

	}
}
