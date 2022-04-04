# Zerodha
package popUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.webroot.com/services/popuptester1.htm");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		
	}

}
