package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://demo.actiTime.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@name='remember']")).click();
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	    driver.findElement(By.xpath("//li[.='Leave Types']")).click();
	    driver.findElement(By.xpath("//span[.='Create Leave Type']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Leave Type Name']")).sendKeys("Holiday");
	    driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
	    driver.findElement(By.xpath("//span[.='Holiday']/../../../../../..//td[@class='leaveTypeDeleteCell last']")).click();
	    Alert alt=driver.switchTo().alert();
	    alt.accept();

	}

}
