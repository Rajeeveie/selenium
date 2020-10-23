package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukrichildbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());//4
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(al.size());//4
		
		driver.switchTo().window(al.get(0));
		//driver.close();
		System.out.println(driver.getTitle()); //NoSuchWindowException
		driver.close();
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(3));
		driver.close();
		System.out.println(driver.getTitle()); //NoSuchSessionException
		

	}

}
