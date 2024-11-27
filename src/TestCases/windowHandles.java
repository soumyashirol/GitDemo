package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String ParentID = it.next();
        String ChildID = it.next();
       
        driver.switchTo().window(ChildID);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
        
        driver.switchTo().window(ParentID);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
        
        driver.quit();
        
        

	}

}
