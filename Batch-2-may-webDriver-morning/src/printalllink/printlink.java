package printalllink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printlink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		 for (WebElement el : link) {
			 
			 System.out.println(el.getText());
			 System.out.println(el.getAttribute("href"));
			
		}

	}

}
