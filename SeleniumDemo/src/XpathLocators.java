import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		
		//absolute xpath
		WebElement men = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a"));
		System.out.println(men.getText());
		men.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		
		//relative xpath
		//syntax = //tagname[@attribute='value']
		WebElement women = driver.findElement(By.xpath("//a[@href='/shop/women']"));
		System.out.println(women.getText());
		women.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		
		//contains xpath method
		//syntax = //*[contains(@attribute,'value')]
		
		
	}

}
