package selenium.plus.three;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGrid {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	String nodeURL;
	
	@BeforeTest
	public void openBrowser() throws MalformedURLException {
		nodeURL="http://10.250.91.78:4444/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL),caps);
	}
	
	@Test
	public void testcase() {
//		driver = BaseClass.getDriver(browser);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
	}
}
