package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		
		WebElement yahooSearch=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		yahooSearch.sendKeys("rajeev");
		Thread.sleep(5000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//b[contains(text(),'rajeev')]/.."));
		System.out.println(suggestion.size());
		 for(int i=0;i<suggestion.size();i++) 
		 {
		  if(suggestion.get(i).getText().equalsIgnoreCase("rajeev kumar")) 
		  {
		  Thread.sleep(3000);
		  suggestion.get(i).click();
		  } 
		 }
		 
	}

}
