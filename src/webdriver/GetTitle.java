package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		/*
		  String title=driver.getTitle();
		  System.out.println(title);
		 */
		System.out.println(driver.getTitle());

	}

}

//output:Google