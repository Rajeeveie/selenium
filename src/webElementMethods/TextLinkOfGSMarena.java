package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLinkOfGSMarena {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com");
		List<WebElement> link=driver.findElements(By.xpath("//li"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++) 
		{
			System.out.println(link.get(i).getText());
			System.out.println(link.get(i).getAttribute("//a"));
		}

	}

}
