package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    WebElement electronics=driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[1]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(electronics).perform();

	}

}
