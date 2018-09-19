package selenium.plus.three;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectElement {
	WebDriver driver;
	String browser = "chrome";
	WebDriverWait wait;
	
	@BeforeMethod
	public void openBrowser() {
		driver = BaseClass.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
	}
	
	@Test(enabled=false)
	public void selectCountry() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		WebElement selCountry = driver.findElement(By.name("country"));
		Select select = new Select(selCountry);
		select.selectByVisibleText("INDIA");
		List<WebElement> countryList =  select.getOptions();
			for (WebElement eachElement : countryList) {
				System.out.println(eachElement.getText());
			}
		
	}
	
	@Test(enabled=false)
	public void findLinks() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		List<WebElement> allLinksList = driver.findElements(By.tagName("a"));
		for (WebElement eachElement : allLinksList) {
			if(!eachElement.getText().equals("")) {
			System.out.println("Link Found : "+eachElement.getText());
			}
		}
	}
	@AfterMethod
	public void closeBrowser() {
//		driver.close();
	}
}
