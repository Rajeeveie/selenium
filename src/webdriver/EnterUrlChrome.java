package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.myntra.com");
		driver.close();    // close() is used to close the window by using selenium
	
	}

}
