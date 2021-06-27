import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeFacebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement FacebookLogo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		
		String FHeading = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();
		
		WebElement userId = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		Boolean logo = FacebookLogo.isDisplayed();
		System.out.println(logo);
		
		System.out.println(FHeading);
		
		userId.sendKeys("mohinikawale@gmail.com");
		password.sendKeys("147258");
		loginBtn.click();
		
	}

}
