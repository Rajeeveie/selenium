package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/rajee/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.myntra.com");

	}

}
