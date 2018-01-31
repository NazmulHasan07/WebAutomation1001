package jetBlue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AirTicket {
	static WebDriver driver;

	public void invokeBrowser(){
		System.setProperty("webdriver.gecko.driver", "F://SOFTWARE/MIXED/geckodriver-v0.19.1-win64/geckodriver.exe");

		driver=new FirefoxDriver();


		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.jetblue.com/#/");	

		findTicketElement();
	}

	public void findTicketElement() {
		driver.findElement(By.xpath("//*[@id='jbBookerDepart']")).sendKeys();
		driver.findElement(By.xpath("//*[@id='jbBookerArrive']")).sendKeys("New York City");
		driver.findElement(By.xpath("//*[@id='jbBookerCalendarDepart']")).sendKeys("02-05-2018");
		driver.findElement(By.xpath("//*[@id='jbBookerCalendarReturn']")).sendKeys("02-28-2018");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/div/div[3]/form/input[5]")).click();
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,1950)","0,700");
		//WebDriver.
	
		Actions A = new Actions(driver);
		A.moveToElement(driver.findElement((By.id("flightSelectGr_0_99")))).build().perform();
		
	}
	public static void main(String[] args) throws InterruptedException {
		AirTicket AT = new AirTicket();
		AT.invokeBrowser();

	}
}

