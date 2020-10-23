package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepInDepxpathFilehippo {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://filehippo.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[.='Popular software']")).click();
	    
	    Thread.sleep(4000);
	   
	    driver.findElement(By.xpath("//p[.='VLC Media Player 64-bit']/../../../../..//span[.='Download']")).click();

	}

}
