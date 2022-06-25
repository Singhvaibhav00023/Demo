package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// absolute xpath - /html/head/ (starts with root)
		// relative xpath - starts with any relative position in between

		// Siblings Parent-child

		// div/button[1]/following-sibling::button[1]

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());

		// System.out.println(driver.findElement(By.xpath("//input[@type=\"submit\"][1]/following-sibling::input[1]")).getText());

		System.out.println(driver
				.findElement(
						By.xpath("//button[text()=\"Practice\"]/following-sibling::button[1]/parent::div/button[2]"))
				.getText());
	}

}
