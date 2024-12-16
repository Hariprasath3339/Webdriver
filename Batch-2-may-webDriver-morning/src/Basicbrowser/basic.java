package Basicbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		
		//To enter the URL
		driver.get("http://triotend.com/tts/site/login");
	
		//Navigate
		driver.navigate().to("http://triotend.com");
		Thread.sleep(4000);
		
		
		//forward
		driver.navigate().forward();
		Thread.sleep(4000);
		
		//backward
		driver.navigate().back();
		Thread.sleep(4000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		//min
		
		//driver.manage().window().minimize();
		Thread.sleep(4000);
		
		//max
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//resize
		Dimension d=new Dimension(475,1024);
		
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		
		//close
		driver.close();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
