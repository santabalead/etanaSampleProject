package etanaProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestProgram {

	public static void main(String[] args) throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("use-fake-ui-for-media-stream");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SantoshKambale\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://qa.beta.etana.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		WebDriverWait mywait=new WebDriverWait(driver,20);

		// Login to ETANA CUSTODY Account
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("qa.testing8877+4116@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='START NOW']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[@class='mat-radio-inner-circle']")).click();
		// Thread.sleep(9000);

		driver.findElement(By.xpath("//*[@data-placeholder='First name']")).clear();
		driver.findElement(By.xpath("//*[@data-placeholder='First name']")).sendKeys("Santosh");
		driver.findElement(By.xpath("//*[@data-placeholder='Last name']")).clear();
		driver.findElement(By.xpath("//*[@data-placeholder='Last name']")).sendKeys("Kambale");
		driver.findElement(
				By.xpath("//*[@data-placeholder='Phone number (including country code) e.g. +44 181 272 1888']"))
				.clear();
		driver.findElement(
				By.xpath("//*[@data-placeholder='Phone number (including country code) e.g. +44 181 272 1888']"))
				.sendKeys("+91 9916026232");
		driver.findElement(By.xpath("//*[text()='NEXT']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@data-placeholder='Country of Citizenship']")).click();
		Thread.sleep(3000);
		
		WebElement ListBox = driver.findElement(By.xpath("//*[@data-placeholder='Country of Citizenship']")); 
		ListBox.sendKeys("Algeria");
		driver.findElement(By.xpath("//*[@class='mat-option-text']")).click();
		
		driver.findElement(By.xpath("//*[text()='Capture Passport Image']")).click();
		Thread.sleep(30000);
				
		driver.findElement(By.xpath("//*[text()='Auto']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Manual']")).click();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//*[text()='Capture Passport Image']")).click();
		Runtime.getRuntime().exec("C:\\autoitfiles\\fileupload.exe"+" "+"E:\\Test\\AttachmentCopies\\Passport.PNG");
		
			
	}

}
