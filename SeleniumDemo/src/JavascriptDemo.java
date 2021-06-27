import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Java Script Executor call into script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//use the method executescript
		WebElement username = null;
		username = (WebElement) js.executeScript("return document.getElementById('email');", username);
		
		js.executeScript("document.getElementById('email').value='mohinikawale@gmail.com'");
		//username.sendKeys("mohinikawale@gmail.com");
		
		WebElement password = null;
		password = (WebElement) js.executeScript("return document.getElementById('pass');",password);
		js.executeScript("document.getElementById('pass').value='123456'");
		
		String classname = (String) js.executeScript("return document.getElementById('pass').getAttribute('data-testid');");
		System.out.println(classname);
		
		//password.sendKeys("123456");
		
		
		//sending custom alert message
		js.executeScript("alert('hello world')");
		
		//handle the alert
		driver.switchTo().alert().accept();
		
		
		//click
		WebElement Login = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		js.executeScript("arguments[0].click();", Login);
		
		//refresh the browser
		//js.executeScript("history.go(0)");
		driver.navigate().refresh();
		
		//get title
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		//System.out.println(driver.getTitle());
		
		
		//get url
		String url = js.executeScript("return document.title;").toString();
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
		//scroll
		driver.navigate().to("https://www.toolsqa.com/");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1350)");
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='Selenium Tutorial in Java']"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		//Actions action = new Actions(driver);
		//action.moveToElement(element).perform();
		
		//navigate to page
		js.executeScript("window.location = 'https://www.lambdatest.com'");
	}

}
