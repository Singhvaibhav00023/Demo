package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Demo {

	public static void main(String[] args) {
		// Invoking Browser

		// Chrome - ChromeDriver exten->Methods close get

		// Firefox- FirefoxDriver ->methods close get

		// WebDriver close get

		// WebDriver methods + class methods

		// Chrome

//		System.setProperty("webdriver.chrome.driver", "C:/Selenium-Libs/Drivers/chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//

		// Firefox

//		System.setProperty("webdriver.gecko.driver", "C:/Selenium-Libs/Drivers/geckodriver.exe");
//
//		WebDriver driver1 = new FirefoxDriver();

		// Microsoft Edge

//		System.setProperty("webdriver.edge.driver", "C://Selenium-Libs/Drivers//msedgedriver.exe");
//
//		WebDriver driver2 = new EdgeDriver();
//
//		driver2.get("https://rahulshettyacademy.com");
//
//		System.out.println(driver2.getTitle());
//
//		System.out.println(driver2.getCurrentUrl());

		// driver2.close();

//		 InternetExplorerOptions ieOptions = new InternetExplorerOptions();
//	        ieOptions.attachToEdgeChrome();
//	        ieOptions.withEdgeExecutablePath("C://Program Files (x86)//Microsoft//Edge//Application//msedge.exe");
//	       // System.setProperty("webdriver.edge.driver", "C://Selenium-Libs/Drivers//msedgedriver.exe");
//	        WebDriver driver3 = new InternetExplorerDriver(ieOptions);
//	        driver3.get("http://www.bing.com");
//	        WebElement elem = driver3.findElement(By.id("sb_form_q"));
//	        elem.sendKeys("WebDriver", Keys.RETURN);
//	        driver3.close();

		// driver.quit();

	}
}
