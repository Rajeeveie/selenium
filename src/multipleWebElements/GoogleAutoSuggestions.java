package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		System.out.println(suggestion.size());
		/*
		 * for(int i=0;i<3;i++) {
		 * 
		 * searchbar.sendKeys(Keys.ARROW_DOWN); } searchbar.sendKeys(Keys.ENTER);
		 */
		//driver.findElement(By.xpath("//b[.=' interview questions']")).click();
        for(int i=0;i<suggestion.size();i++) {
        	if(suggestion.get(i).getText().equalsIgnoreCase("selenium interview questions")) {
        		suggestion.get(i).click();;
        		break;
        	}
        }
	}
}

