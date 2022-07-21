package etanaProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SantoshKambale\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa.beta.etana.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//Register to ETANA CUSTODY Account 
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qa.testing8877+4114@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@1234");
		driver.findElement(By.xpath("//input[@name='password-confirm']")).sendKeys("Welcome@1234");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

	}

}
