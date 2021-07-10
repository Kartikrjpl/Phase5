package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000); 	
		WebElement e = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[17]"));
		System.out.println(e.getText());
		Thread.sleep(2000);
		driver.close();
	}
}
