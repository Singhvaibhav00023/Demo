package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	//Scroll
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(3000);
	
	js.executeScript("document.querySelector('.tableFixHead').scrollTo(0,500)");
	
	List<WebElement> Amt=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	
	int sum=0;
	for (int i = 0; i < Amt.size(); i++) 
	{
		sum=sum+ Integer.parseInt(driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).get(i).getText());
	}
	
	System.out.println("Sum:"+sum);
	}
}
