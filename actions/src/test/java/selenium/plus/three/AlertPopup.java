package selenium.plus.three;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPopup {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
	}
	@Test(enabled=false)
	public void selectCountry() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//input[@class='newsrchbtn']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void switchToFrame() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("get_sign_in")).click();
		WebElement frameId = driver.findElement(By.id("authiframe"));
		driver.switchTo().frame(frameId);
		Thread.sleep(2000);
		driver.findElement(By.id("authMobile")).sendKeys("789789654");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}
}
