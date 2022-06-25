package assignment;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.name("password")).sendKeys("learning");

//		driver.findElement(By.cssSelector("input[value=\"user\"]")).click();
//
//		assertTrue(driver.findElement(By.cssSelector("input[value=\"user\"]")).isSelected());
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		// driver.findElement(By.id("okayBtn")).click();

		Select drpdwn = new Select(driver.findElement(By.cssSelector("select[class=\"form-control\"]")));

		drpdwn.selectByVisibleText("Consultant");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.name("signin")).click();

		// Explicit wait

	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class=\"btn btn-info\"]")));

		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		
		WebElement foo= fwait.until(new Function<WebDriver,WebElement>()
				{
				public WebElement apply(WebDriver driver)
				{
					if(driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).isDisplayed())
					{
						return driver.findElement((By.xpath("//*[@class=\"btn btn-info\"]")));	
					}
					return null;
				}
				});
		
		List<WebElement> addbtn = driver.findElements(By.xpath("//*[@class=\"btn btn-info\"]"));

		for (int i = 0; i < addbtn.size(); i++) {
			driver.findElements(By.xpath("//*[@class=\"btn btn-info\"]")).get(i).click();
		}

		driver.findElement(By.xpath("//*[@class=\"nav-link btn btn-primary\"]")).click();
	}

}
