package identifyLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MailPass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://SOFTWARE//MIXED//chromedriver_win32/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://login.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("naz_hasan007@yahoo.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("pass")).sendKeys("0123456789");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.className("button r4 wide primary")).click();//Error
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("#header_block > span > div > div:nth-child(1) > div._2phz > span")).getText());
		System.out.println(driver.findElement(By.cssSelector("#header_block > span > div > div.fsm.fwn.fcg")).getText());

		Thread.sleep(3000);
	
		
		//driver.quit();
		
		}

	

	
		}
