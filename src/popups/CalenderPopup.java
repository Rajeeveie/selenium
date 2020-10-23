package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='28'])[1]")).click();
		//driver.findElement(By.xpath("(//a[.='28'])[1]")).click();//for 1 month later
		for(int i=0;i<=4;i++) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
	}
		driver.findElement(By.xpath("(//a[.='28'])[2]")).click();

}
}
