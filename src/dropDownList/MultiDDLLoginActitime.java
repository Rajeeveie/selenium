package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDDLLoginActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actiTime.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@name='remember']")).click();
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[.='Types of Work']")).click();
	    driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
	    WebElement status=driver.findElement(By.xpath("//select[@name='active']"));
	    Select sel=new Select(status);
	    System.out.println(sel.isMultiple());
	    Thread.sleep(5000);
	    sel.selectByValue("false");
	    sel.deselectByValue("false");

	}

}
