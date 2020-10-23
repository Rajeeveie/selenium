package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntrapurchage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajee/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		WebElement offers=driver.findElement(By.xpath("//a[.='Offers']"));
        Actions act = new Actions(driver);
        act.moveToElement(offers).perform();;
        WebElement watches= driver.findElement(By.xpath("//a[.='Watches at Min 60%']"));
        act.moveToElement(watches).click(watches).perform();
        driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
        Set<String> watch=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<String>();
        al.addAll(watch);
        driver.switchTo().window(al.get(1));
        System.out.println(al.size());
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
        driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[3]")).click();
        driver.findElement(By.xpath("(//div[.='Place Order'])[2]")).click();
        driver.close();
        driver.switchTo().window(al.get(0));
        System.out.println(driver.getTitle());
        driver.close();

	}

}
