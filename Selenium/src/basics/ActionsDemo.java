package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		Actions action = new Actions(driver);

		WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
		WebElement youraccount=driver.findElement(By.xpath("(//*[text()=\"Your Account\"])[1]"));
		
		//action.moveToElement(accountlist).build().perform();
		
		action.click(youraccount).build().perform();

//		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
//		action.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().contextClick().perform();

	}

}
