package EventListenerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Activitycapture acap=new Activitycapture();
		EventFiringWebDriver eve=new EventFiringWebDriver(driver);
		eve.register(acap);
		driver=eve;
		
		driver.get("http://triotend.com/tts/site/login");
		
		//Login script
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//Direct Child 
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("ul.treeview-menu>li:nth-child(2)")).click();

	}

}
