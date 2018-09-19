package selenium.plus.three;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenerateScreenshot {
	public static void getScreenshot(WebDriver driver, String filePath) throws IOException {
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		FileUtils.copyFile(src, dest);
	}
}
