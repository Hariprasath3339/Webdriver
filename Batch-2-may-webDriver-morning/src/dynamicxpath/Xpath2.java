package dynamicxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		long waitofseconds = 30;
		WebDriverWait w = new WebDriverWait(driver, waitofseconds);

		w.until(ExpectedConditions.visibilityOfElementLocated(null));

		// last()
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("last");
		driver.findElement(By.xpath("(//input[@type='text'])[last()-1]")).sendKeys("last-1");

		// Using position()
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("position");

		// Using index
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("index");

		// Using following xpath axes
		driver.findElement(By.xpath("//input[@name='fullName']/following::input[@name='username']"))
				.sendKeys("following");

		// Using preceding xpath axes
		driver.findElement(By.xpath("//input[@name='username']/preceding::input[@name='fullName']"))
				.sendKeys("preceding");

	}

}
