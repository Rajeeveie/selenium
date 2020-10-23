package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildpopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(allwindows);
		driver.switchTo().window(al.get(3));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Cognizant']")).click();
		
		Set<String> cognizantparent=driver.getWindowHandles();
		ArrayList<String> al1=new ArrayList<String>();
		al1.addAll(cognizantparent);
		driver.switchTo().window(al1.get(4));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		Set<String> amazon=driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>();
		al2.addAll(amazon);
		driver.switchTo().window(al2.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Amazon']")).click();
		Set<String> newwindowamazon=driver.getWindowHandles();
		ArrayList<String> al3=new ArrayList<String>();
		al3.addAll(newwindowamazon);
		driver.switchTo().window(al3.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		Set<String> hsbc=driver.getWindowHandles();
		ArrayList<String> al4=new ArrayList<String>();
		al4.addAll(hsbc);
		driver.switchTo().window(al4.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='HSBC']")).click();
		Set<String> hsbcwindows=driver.getWindowHandles();
		ArrayList<String> al5=new ArrayList<String>();
		al5.addAll(hsbcwindows);
		driver.switchTo().window(al5.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al5.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
