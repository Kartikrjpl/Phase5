package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    
    SoftAssert soft = new SoftAssert();
    WebDriver driver;
    @Test
    public void Launch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(dependsOnMethods = { "Launch" })
    public void Facebook() {
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle()+"0000000");
//        soft.assertEquals("FB Title", driver.getTitle());   
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test(dependsOnMethods = { "Facebook" })
    public void Login() {
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
        soft.assertAll();
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
