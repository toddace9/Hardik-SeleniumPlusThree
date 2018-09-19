package selenium.plus.three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\A07208trng_b4a.04.28\\chromedriver.exe");
		return new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\A07208trng_b4a.04.28\\Documents\\Advance selenium drivers\\geckodriver.exe");
			return new FirefoxDriver();
		} else {
			System.out.println("Browser name invalid");
			return null;
		}
	}
}
