package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarUI {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companions");

		Thread.sleep(5000);
		// driver.findElement(By.name("travel_date")).sendKeys("12-23-2022");
		driver.findElement(By.name("travel_date")).click();
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector(".active.day")).click();

		// for month selection

		while (!driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"datepicker-switch\"]"))
				.getText().contains("December")) {
			driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"next\"]")).click();
		}

		List<WebElement> el = driver.findElements(By.className("day"));

		for (int i = 0; i < el.size(); i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
	}
}
