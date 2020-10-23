package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIncLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demo.actiTime.com");
		
		  driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click(); 
		  Set<String> actiTime=driver.getWindowHandles();
		  ArrayList<String> al=new ArrayList<String>();
		  al.addAll(actiTime);
		  driver.switchTo().window(al.get(1)); System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("//a[.='Try Free']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Enter your first name']")).sendKeys("Rajeev");
		  driver.findElement(By.xpath("//input[@placeholder='Enter your last name']")).sendKeys("kumar"); 
		  driver.close();
		  driver.switchTo().window(al.get(0));
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		  driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		  driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		  Thread.sleep(5000);
		  driver.close();
		  System.out.println("Done");
        
	}

}
