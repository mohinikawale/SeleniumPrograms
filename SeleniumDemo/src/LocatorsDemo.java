import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
		//locator id
		
		WebElement username = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		
		//locator classname
		WebElement LoginBTN = driver.findElement(By.className("button-orange"));
		
		username.sendKeys("XA0634");
		password.sendKeys("123456");
		LoginBTN.click();
		
		driver.get("https://www.facebook.com");
		WebElement userName = driver.findElement(By.name("email"));
		WebElement passWord = driver.findElement(By.name("pass"));
		WebElement LoginBtn = driver.findElement(By.name("login"));
		
		userName.sendKeys("mohinikawale6110@gmail.com");
		passWord.sendKeys("123456");
		LoginBtn.click();
	}

}
