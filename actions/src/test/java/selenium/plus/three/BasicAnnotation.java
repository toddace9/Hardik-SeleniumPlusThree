package selenium.plus.three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAnnotation {

	@Test
	public static void testOne() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\A07208trng_b4a.04.28\\Documents\\Advance selenium drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}
	
}
