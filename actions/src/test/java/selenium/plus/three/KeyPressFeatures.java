package selenium.plus.three;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressFeatures {

	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp/login.htm");
		
	}
	
	@Test
	public void keyPressMethod() throws InterruptedException, IOException {
		Actions mouse = new Actions(driver);
		WebElement uname = driver.findElement(By.name("userName"));
		mouse.moveToElement(uname).click().keyDown(uname,Keys.SHIFT).perform();
		Thread.sleep(2000);
		mouse.sendKeys("hardik");
		Thread.sleep(2000);
		mouse.keyUp(uname, Keys.SHIFT).perform();
		Thread.sleep(2000);
//		Taking screenshot
		GenerateScreenshot.getScreenshot(driver, "C:\\Users\\A07208trng_b4a.04.28\\Documents\\test1.jpg");
		
	}
}
