package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextMyntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com");
	    String homePage=driver.getTitle();
	    System.out.println(homePage);
	   if(homePage.equalsIgnoreCase("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
		   System.out.println("correct home page title");
	   }
	   else {
		   System.out.println("Incorrect home page title");
	   }
	    driver.findElement(By.xpath("//a[.='Offers']")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    if(title.equalsIgnoreCase("Online Shopping Offers on Myntra, Grab upto 40 to 70% off on All Products"))
	    {
	    	System.out.println("correct title");

	}
	    else {
	    	System.out.println("Incorrect title");
	    }
	}
	}
