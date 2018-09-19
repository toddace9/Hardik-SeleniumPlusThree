package selenium.plus.three;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsFeature {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://drikpanchang.com");
	}
	
	@Test
	public void mouseOverMovement() throws InterruptedException, IOException {
		WebElement pachange = driver.findElement(By.xpath("//a[@href='/panchang/hindu-panchangs.html']"));
		Actions mouseAction = new Actions(driver);
//		Move to element, if you want to do perform multiple actions along with the move, 
//		then use build() mouseAction.moveToElement(pachange)build().perform();
		mouseAction.moveToElement(pachange).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[2]/a[3]")).click();
	}
}
