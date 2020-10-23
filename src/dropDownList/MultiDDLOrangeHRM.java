package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDDLOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:///opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//a[.='Directory']")).click();
        WebElement jobTitle=driver.findElement(By.xpath("//select[@name='searchDirectory[job_title]']"));
        Select sel=new Select(jobTitle);
        System.out.println(sel.isMultiple());
        sel.selectByValue("3");
        sel.deselectByValue("3");
	}

}
