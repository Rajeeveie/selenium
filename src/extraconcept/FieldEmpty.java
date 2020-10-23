package extraconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldEmpty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	    WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	    username.sendKeys("somlata");
	    String text=username.getAttribute("value");
	    System.out.println(text.isEmpty());
	    System.out.println(text.length());
	    if(text.length()==0) {
	    	System.out.println("field is empty");
	    }
	    else {
	    	System.out.println("field is not empty");
	    }

	}

}
