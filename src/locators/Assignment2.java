package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actiTime.com");
		WebElement link=driver.findElement(By.linkText("Forgot your password?"));
		link.click();
		driver.navigate().back();
		driver.navigate().refresh();
		WebElement newlink=driver.findElement(By.linkText("actiTIME Inc."));

	}

}
