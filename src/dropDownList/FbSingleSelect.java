package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(6000);
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selDay=new Select(dropdownlist);
		selDay.selectByValue("19");
		WebElement monthdropdownlist=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selMonth=new Select(monthdropdownlist);
		selMonth.selectByValue("10");
		WebElement yeardropdownlist=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selYear=new Select(yeardropdownlist);
		selYear.selectByValue("1991");
		

	}

}
