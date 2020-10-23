package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TeatingPoolDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rajeev");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		WebElement weekdays=driver.findElement(By.xpath("//select[@name='Week']"));
		Select sel=new Select(weekdays);
		System.out.println(sel.isMultiple());
		//System.out.println(sel.getAllSelectedOptions());
		sel.selectByValue("Mon");
		sel.selectByValue("Tue");
		sel.selectByValue("Wed");
		sel.selectByValue("Fri");
		sel.selectByValue("Sat");
		sel.deselectByValue("Tue");
		sel.deselectByValue("Wed");
		WebElement selectNumber=weekdays.findElement(By.xpath("//select[@name='number']"));
		Select number=new Select(selectNumber);
		number.selectByValue("two");
		selectNumber.findElement(By.xpath("//input[@value='red']")).click();
        selectNumber.findElement(By.xpath("//input[@value='green']")).click();
        selectNumber.findElement(By.xpath("//input[@value='white']")).click();
       driver.findElement(By.xpath("//button[@id='bttn']")).click();
	}

}
