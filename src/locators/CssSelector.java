package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		  driver.findElement(By.id("u_0_2")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("RajaBabu");
		  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("kumar");
		  driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("8844556677");
		  driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("helloBrother");
		 		

	}

}
