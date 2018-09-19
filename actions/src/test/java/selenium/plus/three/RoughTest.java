package selenium.plus.three;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RoughTest {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
	}
	
	@Test
	public void testCase1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		WebElement closePopup = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _29YdH8']")));
		closePopup.click();
		WebElement searchBox = driver.findElement(By.name("q"));
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='vh79eN'][@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='vh79eN'][@type='submit']")));
		searchBox.sendKeys("iPhone");
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		searchBox.clear();
		searchBox.sendKeys("Acer Predator Helios");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='vh79eN'][@type='submit']")));
		searchButton.click();
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
//		driver.close();
	}
}
