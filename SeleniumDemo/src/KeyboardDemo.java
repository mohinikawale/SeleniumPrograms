import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//Call Actions class
		Actions actions = new Actions(driver);
		WebElement FirstNmae = driver.findElement(By.cssSelector("input[id='firstName']"));
		
		//actions class key down and key up methods
		actions.keyDown(FirstNmae, Keys.SHIFT);
		actions.sendKeys("mohini");
		actions.keyUp(Keys.SHIFT);
		actions.build().perform();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement user = driver.findElement(By.cssSelector("input[id='userName']"));
		WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
		WebElement CurrentAdd = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		WebElement PerAdd = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		WebElement SubmitBtn = driver.findElement(By.cssSelector("button[id='submit']"));
		
		//driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		actions.keyDown(user, Keys.SHIFT).sendKeys("mohini kawale").keyUp(Keys.SHIFT).build().perform();
		actions.sendKeys(email, "mohinikawale6110@gmail.com").perform();
		actions.sendKeys(CurrentAdd, "Jay Bhavani Nagar Cidco Aurangabad, India").perform();
		actions.keyDown(CurrentAdd, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		actions.keyUp(Keys.CONTROL).perform();
		
		actions.sendKeys(Keys.TAB).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		actions.keyUp(Keys.CONTROL).perform();
		
		actions.sendKeys(Keys.TAB).perform();
		
		actions.click(SubmitBtn).perform();
		
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement DoubleClick = driver.findElement(By.cssSelector("#doubleClickBtn"));
		WebElement RightClick = driver.findElement(By.cssSelector("#rightClickBtn"));
		WebElement ClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		actions.doubleClick(DoubleClick).perform();
		actions.contextClick(RightClick).perform();
		actions.click(ClickMe).perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[class='simple-drop-container']>div[id='droppable']"));
		
		actions.dragAndDrop(source, target).build().perform();
		
		//tooltip
		driver.navigate().to("http://demoqa.com/tool-tips");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		
		actions.moveToElement(textbox).build().perform();
		
		Thread.sleep(1000);
		
		WebElement tooltip= driver.findElement(By.xpath("//div[@id='textFieldToolTip']//div[@class='tooltip-inner']"));
		String tooltiptext = tooltip.getText();
		System.out.println(tooltiptext);
		
		
		
		WebElement Contrary = driver.findElement(By.xpath("//a[@href='javascript:void(0)'][1]"));
		
		actions.moveToElement(Contrary).build().perform();
		
		Thread.sleep(1000);
		WebElement CtoolTip = driver.findElement(By.xpath("//div[@id='contraryTexToolTip']//div[@class='tooltip-inner']"));
		String tooltip1 = CtoolTip.getText();
		System.out.println(tooltip1);
		
		
	}

}
