package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//syntax
	    driver.get("https://demo.actiTime.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@name='remember']")).click();
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    //wait.until(ExpectedConditions.titleIs("somlata")); ----->TimeOutException
	    
	    //wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	    //wait.until(ExpectedConditions.titleContains("actiTIME - Enter"));
	    
	   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));--->TimeOutException due to small l
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='popup_menu_icon'])[2]")));
	    
	    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();

	}

}
