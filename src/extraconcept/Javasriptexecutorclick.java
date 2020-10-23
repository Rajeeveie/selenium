package extraconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javasriptexecutorclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;//downcasting
        js.executeScript("arguments[0].click()", checkbox);
	}

}
