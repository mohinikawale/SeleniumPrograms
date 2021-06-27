import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File soureFile = ts.getScreenshotAs(OutputType.FILE);
		
		//this method replace old screenshot with new screenshotS
		//FileUtils.copyFile(soureFile, new File ("G:\\eclipse-workspace\\SeleniumDemo\\src\\adc.jpeg"));
		
		//this method generate seperate screenshot
		FileUtils.copyFile(soureFile, new File ("G:\\eclipse-workspace\\SeleniumDemo\\src\\"+timestamp()+".jpeg"));	
		
	}

	private static String timestamp() 
	{
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		return timestamp;
	}

}
