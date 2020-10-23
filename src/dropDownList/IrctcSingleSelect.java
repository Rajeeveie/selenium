package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@formcontrolname='resCountry']"));
		Select country = new Select(dropdown);
		country.selectByValue("94");
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
		Select nationality=new Select(dropdown1);
		nationality.selectByValue("94");
		
		driver.findElement(By.xpath("//input[@formcontrolname='resPinCode']")).sendKeys("110091");
		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@formcontrolname='resCity']"));
		Select citytown = new Select(dropdown2);
		Thread.sleep(5000);
		citytown.selectByValue("East Delhi");
		WebElement dropdown3=driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']"));
		Select postoffice=new Select(dropdown3);
		postoffice.selectByValue("Patparganj S.O");

	}

}
