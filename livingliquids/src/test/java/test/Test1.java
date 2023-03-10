package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomliquids.Homepage;
import pomliquids.Liquid_Headers1;
import pomliquids.Whiskey;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Silenium\\New path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://livingliquidz.com/");
	//	Homepage homepage = new Homepage(driver);
		//homepage.clickOnPlatinium();
//		homepage.verifylogoname();
//		homepage.clickOnSpirits();
		
		Liquid_Headers1 Liquid_Headers1 = new Liquid_Headers1(driver);
		Liquid_Headers1.clickOnSpirits();
		Thread.sleep(2000);
		Liquid_Headers1.clickonWhiskey();
		Thread.sleep(2000);
		Whiskey whiskey=new Whiskey(driver);
		whiskey.clickOnAddtoCart();
		Thread.sleep(2000);
		Liquid_Headers1.clickOnAddtoCartIcon();
		Thread.sleep(45000);
		driver.close();
	}
}
