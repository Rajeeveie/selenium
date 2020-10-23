package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpYahooByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rajeev");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kumar");
	    driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("rajeeveie");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("HelloBrother");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8899776655");
	    driver.findElement(By.xpath("//select[@name='mm']")).sendKeys("Octuber");
	    driver.findElement(By.xpath("//input[@name='dd']")).sendKeys("19");
	    driver.findElement(By.xpath("//input[@name='yyyy']")).sendKeys("1991");
        driver.findElement(By.xpath("//input[@name='freeformGender']")).sendKeys("Male");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
