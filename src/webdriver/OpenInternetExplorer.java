package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:/Users/rajee/Downloads/IEDriverServer_x64_2.52.2/IEDriverServer.exe");
    WebDriver driver =new InternetExplorerDriver();
    driver.navigate().to("www.google.com");
	}

}
