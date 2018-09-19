package selenium.plus.three;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sun.glass.events.KeyEvent;

public class UploadFileRoboFramework {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp/routeaddprod.htm");
	}
	
	public static void uploadFile() throws AWTException, InterruptedException {
//		 Specify the file location with extension
		 StringSelection sel = new StringSelection("C:\\Users\\A07208trng_b4a.04.28\\Documents\\test1.png");
//		 Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 Robot robo = new Robot();
//		 Press Enter
		 robo.keyPress(KeyEvent.VK_ENTER);
//		 Release Enter
		 robo.keyRelease(KeyEvent.VK_ENTER);
//		 Press Cntrl+V
		 robo.keyPress(KeyEvent.VK_CONTROL); 
		 robo.keyPress(KeyEvent.VK_V);
//		 Release Cntrl+V
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 robo.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
//		 Press Enter
		 robo.keyPress(KeyEvent.VK_ENTER);
		 robo.keyRelease(KeyEvent.VK_ENTER); 
	}
	
	@Test
	public void uploadingTheFile() throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=' btn btn-default image-preview-input']")).click();
		UploadFileRoboFramework.uploadFile();
	}
}
