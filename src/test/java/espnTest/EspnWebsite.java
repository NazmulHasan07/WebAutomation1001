package espnTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EspnWebsite {
	WebDriver driver;

	public void invokeBrowser() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.gecko.driver", "F://SOFTWARE/MIXED/geckodriver-v0.19.1-win64/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    

		//driver.get("http://www.espncricinfo.com");

		driver.get("http://www.espncricinfo.com");

		findLink ();  

	}

	public void findLink () {

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[@id='global-nav']/ul/li[2]/a/span/span[1]"))).build().perform();

		driver.findElement(By.xpath("/html/body/div[6]/div[2]/header/nav[1]/ul/li[2]/div/ul/li[4]/a/span/span[1]")).click();

	}


	public static void main(String[] args) throws InterruptedException {



		EspnWebsite ESPN = new EspnWebsite();

		ESPN.invokeBrowser();


	}

}