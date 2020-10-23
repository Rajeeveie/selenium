package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	    WebElement link=driver.findElement(By.linkText("Create a Page"));
       // link.click();
      // WebElement newlink=driver.findElement(By.linkText("Create a Page"));
       
        System.out.println(link.getText());
        driver.close();
	}

}
