package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws AWTException, InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajee\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://filehippo.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[.='Popular software']")).click();
	   
	    driver.findElement(By.xpath("//p[.='VLC Media Player 64-bit']/../../../../..//span[.='Download']")).click();
	    
	    driver.findElement(By.xpath("//a[.='Download Latest Version']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@id='modal-di-continue-link']")).click();
	    Robot r=new Robot();
	    for(int i=0;i<=1;i++) {
	    	Thread.sleep(5000);
	    r.keyPress(KeyEvent.VK_TAB);

	}
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_ENTER);
	}
}
