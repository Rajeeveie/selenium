package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8826589638");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9939970377");
	    driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
