package popups;

import java.util.concurrent.TimeUnit;    

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenMyntra {

	public static void main(String[] args) {
		//webpushNotifications/Notification popup
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(option);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.myntra.com");
		  driver.findElement(By.xpath("//a[.='Offers']")).click();
		 

	}

}
