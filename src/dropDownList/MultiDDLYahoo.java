package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDDLYahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
		Select countrycode=new Select(dropdown);
		System.out.println(countrycode.isMultiple());
		countrycode.selectByValue("IN");
		countrycode.deselectByValue("IN");
	}

}
