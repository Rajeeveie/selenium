package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.qspiders.com/contact"); 
		  
		 String text1=driver.findElement(By.xpath("//span[.='+919810072392']/../../..//p[.='Noida']")).getText();
		 System.out.println(text1);
		 
		 
		 
		String text2=driver.findElement(By.xpath("//span[.='+14154293957']/../../..//p[.='United States']")).getText();
		System.out.println(text2);
		 
	}

}
