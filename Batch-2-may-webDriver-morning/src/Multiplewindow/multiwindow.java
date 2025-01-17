package Multiplewindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiwindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		
		driver.findElement(By.cssSelector("button#windowButton")).click();
      
		long waitofseconds=40;
		driver.manage().timeouts().implicitlyWait(waitofseconds, TimeUnit.SECONDS);
		
		Set<String> swin=driver.getWindowHandles();
		
		ArrayList<String>win=new ArrayList<String>(swin);
		
		driver.switchTo().window(win.get(1));
		
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(win.get(0));
		
		String pid1=driver.getWindowHandle();
		
		System.out.println(pid1);
		
		
		
		
	}

}
