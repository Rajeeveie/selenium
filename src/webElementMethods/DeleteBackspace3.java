package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteBackspace3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.xpath("//input[@name='firstname']"));
		username.sendKeys("Priyanka");
		username.sendKeys(" Bhat");

	}

}
