import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohinikawale6110@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='lastname']"))).sendKeys("Kawale");
		
		//driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Kawale");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='websubmit']"))).click();
		
	}

}
