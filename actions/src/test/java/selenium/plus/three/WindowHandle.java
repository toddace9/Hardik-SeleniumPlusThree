package selenium.plus.three;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://naukri.com");
	}
	
	@Test(enabled=false)
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
	
//	How to Iternate through Sets
//	Sets is a collection of Unique values.
	@Test(enabled=false)
	public void workingWithSet() {
		Set<Object> sObj = new HashSet<Object>();
		sObj.add("A");
		sObj.add("B");
		sObj.add("C");
//		Creating an object or Iterator
		Iterator<Object> itr = sObj.iterator();
//		This will fetch the data from the Set
		while(itr.hasNext()) {
			System.out.println("Value in Set is : "+itr.next());
		}
	}
	
	@Test
	public void windowHandling() {
//		Set<String> s = driver.getWindowHandles();
//		Iterator<String> itr = s.iterator();
//		
//		String parentWindow = itr.next();
//		String childWindow = itr.next();
//		Switching to Child Window
//		driver.switchTo().window(childWindow);
//		driver.close();
//		Switching back to Parent Window
//		driver.switchTo().window(parentWindow);
//		
//		To Iterate through multiple Windows, use windowHandles
		String parentWindow2 = driver.getWindowHandle();
		Set<String> childWindows2 = driver.getWindowHandles();
		for(String eachChild : childWindows2) {
			if(!eachChild.equals(parentWindow2)) {
				driver.switchTo().window(eachChild);
				driver.close();
			}
		}
	}
}
