package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSizeBrowserSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(900,600);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
