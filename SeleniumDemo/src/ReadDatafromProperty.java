import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromProperty {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		FileInputStream file = new FileInputStream("C:\\Users\\MOHINI\\eclipse-workspace\\SeleniumDemo\\src\\data.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		driver.get(prop.getProperty("url"));
		
		String s = prop.getProperty("implicitwait");
		//converting String inyo int using Integer.parseInt()
		int i = Integer.parseInt(s);
		
		
		String s1 = prop.getProperty("pageloadtimeout");
		//converting String inyo int using Integer.parseInt()
		int i1 = Integer.parseInt(s1);
		
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(i1, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.xpath("//button[@id='u_0_d_5U']"));
		//prop.getProperty(login.click());
	}

}
