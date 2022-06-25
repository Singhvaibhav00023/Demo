package assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Locators(Add to Cart)-> // -> (//*[text()='ADD TO CART'])[3] || //
		// *[text()="Cucumber - 1 Kg"]/parent::div//button

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Libs\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //
		// Implicit wait

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] veggies = { "Cucumber", "Beetroot", "Brocolli" };

		additems(driver, veggies);

		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"PROCEED TO CHECKOUT\"]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void additems(WebDriver driver, String[] veggies) {

		List<WebElement> elements = driver.findElements(By.cssSelector("h4.product-name"));

		// Using array list
		int j = 0;
		for (int i = 0; i < elements.size(); i++) {
			String[] product = elements.get(i).getText().split("-");

			String formattedtext = product[0].trim();

			List listelementsneeded = Arrays.asList(veggies);

			if (listelementsneeded.contains(formattedtext)) {
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				if (j == veggies.length) {
					break;
				}
			}
		}

	}

}

// Using Array
//for (int i = 0; i < elements.size(); i++) 
//{
//	String product= elements.get(i).getText();
//	
//	for (String veg : veggies)
//	{
//		if(product.contains(veg))
//		{
//		//	driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
//	    // while using text facing indexing issue as add to cart button is changing for few seconds after clicking
//		driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
//			System.out.println(veg+"Added");
//			//Thread.sleep(5000);
//			break;
//			
//		}
//	}
//	
//}
//