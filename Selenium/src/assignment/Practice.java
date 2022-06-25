package assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
	//count of links
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	//count of footer links using xpath
	System.out.println(driver.findElements(By.xpath("//*[@id=\"gf-BIG\"]//a")).size());
	
	//count of footer links while limiting scope of driver
	WebElement footer=driver.findElement(By.id("gf-BIG"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	//count of first column links using xpath
	System.out.println(driver.findElements(By.xpath("//*[@id=\"gf-BIG\"]//td[1]//a")).size());
	
	//count of first column by limiting scope
	
	WebElement firstcolumn=footer.findElement(By.xpath("//*[@id=\"gf-BIG\"]//td[1]"));
	System.out.println(firstcolumn.findElements(By.tagName("a")).size());
	
	for (int i = 1; i <firstcolumn.findElements(By.tagName("a")).size() ; i++) 
	{
		String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
	Thread.sleep(5000);
	}
	
	
	Set<String> windows=driver.getWindowHandles();

	Iterator<String> it= windows.iterator();
	
    System.out.println("windows opened "+windows.size());
	
    while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		
		System.out.println("URL" +driver.getCurrentUrl()+"Title"+driver.getTitle());
		
	}
	}
	
       
	
}