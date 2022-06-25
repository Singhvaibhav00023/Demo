package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://stackoverflow.com/");
		
		Thread.sleep(3000);
        
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Join the community")).sendKeys(selectLinkOpeninNewTab);
				
		Thread.sleep(3000);
		
// Way 1		
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(1));
//	    Thread.sleep(5000);
//	    driver.switchTo().window(tabs2.get(0));
	    
// Way 2
		
		String parentwindow = driver.getWindowHandle();
		for (String windowhandle : driver.getWindowHandles())
		{
		if(!windowhandle.equals(parentwindow))
		{
			driver.switchTo().window(windowhandle);
		}
		}
		
		String childwindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindow);
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//	
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		
//        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
//		
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
//		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
//		{
//			System.out.println("Is Enabled");
//			Assert.assertTrue(true);
//		}
	}
}
