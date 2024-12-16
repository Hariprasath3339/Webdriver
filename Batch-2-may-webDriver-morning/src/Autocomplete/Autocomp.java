package Autocomplete;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Suriya");

		long waitofseconds = 20;
		driver.manage().timeouts().implicitlyWait(waitofseconds, TimeUnit.SECONDS);

		List<WebElement> lis = driver.findElements(By.cssSelector("ul.G43f7e>li"));

		for (WebElement el : lis) {

			System.out.println(el.getText());
			
		}

	}

}
