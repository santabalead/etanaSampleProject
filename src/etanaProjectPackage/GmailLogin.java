package etanaProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SantoshKambale\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	     driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		// identify email
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("qa.testing8877@gmail.com");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		// identify password
		//driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("qa.testing8877@gmail.com");
		
		// close browser
		//driver.close();
	}
}
