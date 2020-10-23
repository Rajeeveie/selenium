package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooSingleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
		Select countrycode=new Select(dropdown);
		countrycode.selectByValue("IN");
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		Select month=new Select(dropdownlist);
		month.selectByValue("10");
	}

}
