package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watches");
		Thread.sleep(2000);
		WebElement testDropDown5 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Thread.sleep(2000);
		Select dropdown5 = new Select(testDropDown5);  
		dropdown5.selectByIndex(12);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sony")).click();
		Thread.sleep(2000);
	}
}

