package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import net.bytebuddy.matcher.EqualityMatcher;

public class CheckTitleCorrectOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase("Google")) 
		{
		System.out.println("title is maching");	
		}
		else
		{
			System.out.println("title is not matching");
		}
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains("com")) {
			System.out.println("its present");
		}
		else {
			System.out.println("its not present");
		}
		
	}
}
