package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[text()=\"Multiple Windows\"]")).click();
		
		driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
				
	    // Using Set
//	    Set<String> windows = driver.getWindowHandles();
//	    
//	    Iterator<String> it = windows.iterator();
//	    
//	    String parentid= it.next();
//	    String childid= it.next();
	    
		//Using ArrayList
		
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
		
		String parentid= windows.get(0);
	    String childid= windows.get(1);
	    
	    driver.switchTo().window(childid);
	    
	  System.out.println(driver.findElement(By.cssSelector("div[class=\"example\"] h3")).getText());
	  
	  driver.switchTo().window(parentid);
	  
	  System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText());
	}

}
