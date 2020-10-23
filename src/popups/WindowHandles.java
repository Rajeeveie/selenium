package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);

	}

}
