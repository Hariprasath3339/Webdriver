package Waittime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class typesofwait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebElement te = driver.findElement(By.cssSelector(""));
		Thread.sleep(4000);

		long waitofseconds = 30;
		WebDriverWait w = new WebDriverWait(driver, waitofseconds);

		w.until(ExpectedConditions.visibilityOfElementLocated(null));

	}

}
