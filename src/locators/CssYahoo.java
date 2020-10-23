package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssYahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("createacc")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='usernamereg-firstName']")).sendKeys("Rajeev");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("idea3514");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("HelloBrother");
		driver.findElement(By.cssSelector("input[pattern='[0-9-() ]*']")).sendKeys("8877665544");
		driver.findElement(By.cssSelector("select[name='mm']")).sendKeys("19");
        driver.findElement(By.cssSelector("input[name='dd']")).sendKeys("October");
        driver.findElement(By.cssSelector("input[name='yyyy']")).sendKeys("1991");
        driver.findElement(By.cssSelector("input[name='freeformGender']")).sendKeys("Male");
        driver.close();
	}

}
