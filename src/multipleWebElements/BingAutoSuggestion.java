package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		WebElement bingsearch=driver.findElement(By.xpath("//form[@id='sb_form']"));
		
		bingsearch.sendKeys("rajeev");
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'rajeev')]"));
		System.out.println(suggestions.size());
		
		
		  for(int i=0;i<suggestions.size();i++) {
			  Thread.sleep(5000);
		  if(suggestions.get(i).getText().equalsIgnoreCase("rajeev kumar")) {
		  suggestions.get(i).click(); 
		  break; 
		  }
		 }
}
}
