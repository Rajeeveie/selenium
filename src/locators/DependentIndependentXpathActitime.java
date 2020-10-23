package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpathActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		  driver.get("https://demo.actitime.com");
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
          driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
          driver.findElement(By.xpath("//a[.='Types of Work']")).click();
          driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
          driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rajeev");
          driver.findElement(By.xpath("//body")).click();
          driver.findElement(By.xpath("//input[@type='submit']")).click();
          driver.findElement(By.xpath("(//a[.='Rajeev']/../..//td[@nowrap='1'])[6]")).click();
	}

}
