package extraconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlinginsecureWebsite {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);//	SSL certificate(secure soket layer)
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver(option);
        driver.get("Any insecure websitts");

	}

}
