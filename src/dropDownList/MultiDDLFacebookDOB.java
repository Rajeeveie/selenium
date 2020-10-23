//To use deSelect method dropDown List should have multi select option.
package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDDLFacebookDOB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(5000);
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selDay=new Select(dropdownlist);
		System.out.println(selDay.isMultiple());//To check single select or multiselect
		selDay.selectByValue("19");//single select 
		selDay.deselectByValue("19");//unSupportedOperationExcution
		
		WebElement monthdropdownlist=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selMonth=new Select(monthdropdownlist);
		System.out.println(selMonth.isMultiple());//To check single select or multiselect
		selMonth.selectByValue("10");//single select
		selMonth.deselectByValue("10");//unSupportedOperationExcution
		
		WebElement yeardropdownlist=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selYear=new Select(yeardropdownlist);
		System.out.println(selYear.isMultiple());//To check single select or multiselect
		selYear.selectByValue("1991");//single select
		selYear.deselectByValue("1991");//unSupportedOperationExcution

	}

}
