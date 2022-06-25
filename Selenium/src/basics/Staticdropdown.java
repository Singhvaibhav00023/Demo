package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Select drpdown = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));

		drpdown.selectByIndex(1);
		drpdown.selectByValue("USD");
		drpdown.selectByVisibleText("INR");
		System.out.println(drpdown.getFirstSelectedOption());

	}
}
