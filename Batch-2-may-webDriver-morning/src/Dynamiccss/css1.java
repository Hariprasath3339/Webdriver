package Dynamiccss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		//Tag and ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("Tag and Id");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag and Class
		driver.findElement(By.cssSelector("input.form-username")).sendKeys("Tag and clas");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag and Attribute 
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Tag and Attribute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag, Class, and Attribute
		driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).sendKeys("Tag,class and attribute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag, ID, and Attribute
		driver.findElement(By.cssSelector("input#email[placeholder='Username']")).sendKeys("Tag,ID and attribute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Starts With 
		driver.findElement(By.cssSelector("input[placeholder^='Us']")).sendKeys("startswith");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Endswith
		driver.findElement(By.cssSelector("input[placeholder$='me']")).sendKeys("Endswith");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//contains
		driver.findElement(By.cssSelector("input[placeholder*='name']")).sendKeys("Contains");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		
	}

}
