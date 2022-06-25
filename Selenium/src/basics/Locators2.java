package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String name = "Rahul";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");

		driver.findElement((By.cssSelector(".submit"))).click();

		// Forgot Password

		Thread.sleep(1000);

		String password = getPassword(driver);
		// Correct login

		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement((By.cssSelector(".submit"))).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to " + name + " Shetty Academy");
		System.out.println("Assertion Passed");

		// xpath using text directly
		driver.findElement((By.xpath("//button[text()='Log Out']"))).click();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		;

		Thread.sleep(1000);

		String password = driver.findElement(By.className("infoMsg")).getText();

		String arr[] = password.split("'");

		password = arr[1];

		// button[text()='Go to Login']
		driver.findElement(By.xpath("//*[text()='Reset Login']")).click();

		return password;
	}
}
