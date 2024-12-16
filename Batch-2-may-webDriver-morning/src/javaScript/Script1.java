package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://erp.triotend.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		//To enter a text
		js.executeScript("document.getElementById('user_email').value='test'");
		
		//To click on button
		Thread.sleep(4000);
		//js.executeScript("document.getElementById('login_button').click()");
		
		WebElement btn=driver.findElement(By.id("login_button"));
		
		js.executeScript("arguments[0].click()", btn);
		Thread.sleep(4000);
		//To refresh the page
		js.executeScript("history.go(0)");
		Thread.sleep(4000);
		
		//title
		System.out.println(js.executeScript("return document.title"));
		Thread.sleep(4000);
		//URL
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(4000);
		//domain
		System.out.println(js.executeScript("return document.domain"));
		Thread.sleep(4000);
		//Inner Text
		System.out.println(js.executeScript("return document.documentElement.innerText"));
				
		

	}

}
