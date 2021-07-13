package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
		int numberOfFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(numberOfFrames);
		
		WebElement el1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(el1);
		System.out.println("Switched to frame 1");
		
		
		WebElement el2 = driver.findElement(By.tagName("body"));

		System.out.println(el2.getText());
		
		int numberOfFrames2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(numberOfFrames2);
		
		driver.switchTo().frame(0);
		
		int numberOfFrames3 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(numberOfFrames3);
		
		
	}
	
	

}
