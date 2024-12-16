package Errorcapturing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Errorcapture {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://erp.suryaudayspinningmills.com:8453/SDMS");

		WebElement error1 = driver.findElement(By.xpath("//span[text()='Invalid username or password.']"));

		System.out.println(error1.isDisplayed());

		/*
		 * WebElement
		 * error2=driver.findElement(By.xpath("//p[text()='Password field is required']"
		 * ));
		 * 
		 * System.out.println(error2.isDisplayed());
		 */
	}

}
