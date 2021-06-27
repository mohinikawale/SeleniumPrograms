import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();//to maximize window
		
		//locator id
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		
		//locators basic xpath
		//syntax= //tagname[@attribute='value']
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		WebElement male = driver.findElement(By.id("gender-radio-1"));
		WebElement female = driver.findElement(By.id("gender-radio-2"));
		
		WebElement userMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		//WebElement Subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
		//WebElement SelectEnglish = driver.findElement(By.xpath("//div[@class='css-12jo7m5']"));
		WebElement Sports = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		WebElement Reading = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		WebElement Music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		WebElement CAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		firstname.sendKeys("Mohini");
		lastname.sendKeys("Kawale");
		email.sendKeys("mohinikawale@gmail.com");
		
		//if click() & submit() method doesnt work then use JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", female);
		//female.click();
		userMobile.sendKeys("7972958671");
		//Subjects.sendKeys("en");
		//SelectEnglish.click();
		//Reading.click();
		js.executeScript("arguments[0].click()", Reading);
		//Music.click();
		js.executeScript("arguments[0].click()", Music);
		CAddress.sendKeys("Cidco Aurangabad");
		//submit.click();
		js.executeScript("arguments[0].click()", submit);
		
		//On Kite page
		driver.navigate().to("https://kite.zerodha.com");
		
		
		//tagName
		List<WebElement> link =driver.findElements(By.tagName("A"));
		System.out.println("Number of links on kite page: "+link.size());
		
		List<WebElement> image =driver.findElements(By.tagName("img"));
		System.out.println("Number of images on kite page: "+image.size());
		
		//linkText and partialLinkText
		WebElement ForgotPassLink = driver.findElement(By.linkText("Forgot password?"));
		//ForgotPassLink.click();
		WebElement PartialLink = driver.findElement(By.partialLinkText("account? Signup"));
		PartialLink.click();
		
		//On facebook page
		driver.navigate().to("https://www.facebook.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on facebook page: "+links.size());
		
		//to find frame use iframe tag, for headings use h1 to h6 tag
	}

}
