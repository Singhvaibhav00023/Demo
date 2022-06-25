package basics;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.Select;

public class IEDriverSample {
	public static void main(String[] args) throws InterruptedException {
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		ieOptions.attachToEdgeChrome();
		ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

		WebDriver driver = new InternetExplorerDriver(ieOptions);
		WebDriver chromedriver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Select drpdown = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));

		drpdown.selectByIndex(1);
		drpdown.selectByValue("USD");
		drpdown.selectByVisibleText("INR");
		System.out.println(drpdown.getFirstSelectedOption());
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		
		prefs.put("download.default_directory", "/directory/path");
		
		options.setExperimentalOption("prefs", prefs);
		
		options.addExtensions(new File(""));
	
		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));
	}
}