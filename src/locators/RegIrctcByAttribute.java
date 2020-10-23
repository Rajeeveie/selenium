package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegIrctcByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	    driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys("Rajeev");
	    driver.findElement(By.xpath("//input[@formcontrolname='usrPwd']")).sendKeys("hellobrother");
	    driver.findElement(By.xpath("//input[@formcontrolname='cnfUsrPwd']")).sendKeys("hellobrother");
	    driver.findElement(By.xpath("//input[@formcontrolname='secAns']")).sendKeys("remember");
	    driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Dinga");
	    driver.findElement(By.xpath("//input[@formcontrolname='middleName']")).sendKeys("Dingi");
	    driver.findElement(By.xpath("//input[@formcontrolname='lastname']")).sendKeys("Manga");
	    driver.findElement(By.xpath("(//input[@value='M'])[1])")).click();
	    driver.findElement(By.xpath("(//input[@value='F'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@value='T'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@value='M'])[2]")).click();

	}

}
