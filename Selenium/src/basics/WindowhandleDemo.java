package basics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// Way 1		
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(1));
//	    Thread.sleep(5000);
//	    driver.switchTo().window(tabs2.get(0));
		
		//Way2
		 Set<String> windows=driver.getWindowHandles();
		 Iterator<String> it= windows.iterator();
		 String parentwindow=it.next();
		 String childwindow=it.next();
		 
		 driver.switchTo().window(childwindow);
		 System.out.println(driver.findElement(By.cssSelector(".clearfix li:nth-child(1)")).getText());
		 String uname = driver.findElement(By.cssSelector(".clearfix li:nth-child(1)")).getText().split("@")[1];
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(parentwindow);
	     driver.findElement(By.id("username")).sendKeys(uname);
	}
}
