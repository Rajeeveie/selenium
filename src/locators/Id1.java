package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Id1 {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rajee\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com");

		driver.findElement(By.id("username")).sendKeys("rajeeveie");
		driver.findElement(By.name("pwd")).sendKeys("1122334455");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButtonContainer")).click();
	}

}
