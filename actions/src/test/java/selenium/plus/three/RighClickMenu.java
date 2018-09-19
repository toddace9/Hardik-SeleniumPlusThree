package selenium.plus.three;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class RighClickMenu {
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
	public void keyPressMethod() throws InterruptedException, AWTException {
		Actions mouse = new Actions(driver);
		WebElement fp=driver.findElement(By.id("sam"));
//		This will do a right click on the element
		mouse.moveToElement(fp).contextClick().perform();
//		This will work on the rightclick menu
//		Create object of rightclick menu Robot
		Thread.sleep(2000);
		Robot rightWindow = new Robot();
//		This will press the down arrow on the context Menu
		rightWindow.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
//		This will press the down arrow on the context Menu
		rightWindow.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
//		This will press the Enter Key on the context Menu
		rightWindow.keyPress(KeyEvent.VK_ENTER);
		
		
	}
}
