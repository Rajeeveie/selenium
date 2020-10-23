package extraconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryfyErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin");
		WebElement next=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",next);
        WebElement errormessage=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
        String actalMessage=errormessage.getText();
        System.out.println(actalMessage);
        if(actalMessage.equalsIgnoreCase("Enter an email or phone number"))
        {
        	System.out.println("Both actual and expected are matching");
        }
        else
        {
        	System.out.println("Both actual and expected are matching");
        }
        
	}

}
