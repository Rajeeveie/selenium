package extraconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Argument;

public class HandlingChatbot {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.findElement(By.id("corover-close-btn")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("corover-disha-icon")));
		
		driver.findElement(By.id("corover-disha-icon")).click();
		driver.switchTo().frame("corover-disha-icon");
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("Hello brother");
       // JavascriptExecutor js=(JavascriptExecutor) driver;
        //js.executeScript("argument[0].value='Hello brother'",chatbot );
	}

}
