package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.get("https://demo.actiTime.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@name='remember']")).click();
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	    
	    driver.findElement(By.xpath("//a[.='Types of Work']")).click();
	    driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Manga");
	    driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	    Alert alt=driver.switchTo().alert();
	   // alt.accept();
	    alt.dismiss();

	}

}
