package dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		//Using Single Slash or absolute
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Absolute");
		
        //Using Double Slash  
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		
		//Using Single Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("single attribute");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		//Using Multiple Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username'][@class='form-username form-control']")).sendKeys("multiple");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		//Using AND 
		 driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']")).sendKeys("AND");
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
	//OR	
		
		driver.findElement(By.xpath("//input[@placeholder='test' or @name='username']")).sendKeys("AND");
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
				
    //Using contains
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("Contains");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
  //Starts-with		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Us')]")).sendKeys("Starts-with");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
	//Using text
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	}

}
