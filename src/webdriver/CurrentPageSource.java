package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getPageSource());
	}

}
