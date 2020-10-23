package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
		
		/*
		 * WebElement username=driver.findElement(By.id("email"));
		 * username.sendKeys("Dinga");
		 */
		 
	    driver.findElement(By.id("email")).sendKeys("Rajeev");

	}

}
