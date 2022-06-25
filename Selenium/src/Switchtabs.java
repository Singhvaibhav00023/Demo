import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs
{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stackoverflow.com/users/login");
		
		Thread.sleep(3000);
        
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Sign up")).sendKeys(selectLinkOpeninNewTab);
				
		Thread.sleep(3000);
		
// Way 1		
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(1));
//	    Thread.sleep(5000);
//	    driver.switchTo().window(tabs2.get(0));
	    
// Way 2
		//store handle of parent window
		String parentwindow = driver.getWindowHandle();
		for (String windowhandle : driver.getWindowHandles())
		{
		if(!windowhandle.equals(parentwindow))
		{
			driver.switchTo().window(windowhandle);
		}
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("display-name")).sendKeys("vaibhav");
		
		Thread.sleep(2000);
		
		//store handle of child window
		String childwindow = driver.getWindowHandle();
		
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("singhvaibhav00023@gmail.com");
		
		Thread.sleep(2000);
		
		//Again switch to child window
		
		driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("singhvaibhav00023@gmail.com");
		
		
	}
	
}