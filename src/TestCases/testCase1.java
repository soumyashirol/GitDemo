package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
		
		if(Title.equals("Automation Exercise") ){
			System.out.println("The home page is displayed");
		}else {
			System.out.println("The home page is not displayed");
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		
	    String Xpath = "//div/h2[text()='New User Signup!']";
	    WebElement element = driver.findElement(By.xpath(Xpath));
	    if(element.isDisplayed()&& element.getText().equals("New User Signup!")) {
	    	System.out.println("The new user signup form is displayed");
	    }else {
	    	System.out.println("The new user signup form is not displayed");
	    }
	    
	    WebElement name = driver.findElement(By.name("name"));
	    name.sendKeys("Soumya Shirol");
	    String username = name.getAttribute("value");
	    System.out.println("username is "+username);
	    driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("soumyasagarshirol@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Signup']")).click();
	    Thread.sleep(2000);
	    
	    String Xpath2= "//h2/b[text()='Enter Account Information']";
	    WebElement element1 = driver.findElement(By.xpath(Xpath2));
	    if(element1.getText().equals("ENTER ACCOUNT INFORMATION")) {
	    	System.out.println("Enter Account information form is displayed");
	    }
	    else {System.out.println("Enter Account information form is not displayed");
	    }
	    driver.findElement(By.id("id_gender2")).click();
	    driver.findElement(By.name("password")).sendKeys("Soums@1435");
	    
	    WebElement dayDropdown = driver.findElement(By.id("days"));
	    WebElement monthDropdown = driver.findElement(By.id("months"));
	    WebElement yearDropdown = driver.findElement(By.id("years"));
	    
	    Select daySelect = new Select(dayDropdown);
	    Select monthSelect = new Select(monthDropdown);
	    Select yearSelect = new Select(yearDropdown);
	    
	    daySelect.selectByValue("1");
	    Thread.sleep(2000);
	    monthSelect.selectByVisibleText("September");
	    Thread.sleep(2000);
	    yearSelect.selectByValue("1996");
	    
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.id("optin")).click();
	   
	    WebElement firstname = driver.findElement(By.id("first_name"));
	    firstname.sendKeys("Soumya");
	    WebElement lastname = driver.findElement(By.id("last_name"));
	    lastname.sendKeys("Shirol");
	    
	    driver.findElement(By.id("company")).sendKeys("TCS");
	    driver.findElement(By.id("address1")).sendKeys("102/A,3rd floor,7th main road");
	    driver.findElement(By.id("address2")).sendKeys("RPC layout, Hampinagar, Vijayanagar");
	    WebElement countryDropdown = driver.findElement(By.id("country"));
	    Select countrySelect = new Select(countryDropdown);
	    countrySelect.selectByVisibleText("India");
	    driver.findElement(By.id("state")).sendKeys("Karnataka");
	    driver.findElement(By.id("city")).sendKeys("Bangalore");
	    driver.findElement(By.id("zipcode")).sendKeys("560104");
	    driver.findElement(By.id("mobile_number")).sendKeys("8951176363");
	    driver.findElement(By.xpath("//button")).click();   

	    String Xpath3 = "//h2/b";
	    WebElement element3 = driver.findElement(By.xpath(Xpath3));
	    if(element3.isDisplayed()&& element3.getText().equals("ACCOUNT CREATED!")) {
	    	System.out.println("ACCOUNT CREATED! message is displayed successfully");
	    }else {
	    	System.out.println("ACCOUNT CREATED! message is not displayed and account is not created");
	    }
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
	    
	    Thread.sleep(3000);
	    
	    String xpath4 = "//a[contains(text(),'Logged in as')]";
	    WebElement loggedInAs = driver.findElement(By.xpath(xpath4));
	    String ExpectedText = "Logged in as "+username+"";
	    if(loggedInAs.isDisplayed()&& loggedInAs.getText().equals(ExpectedText)) {
	    	System.out.println("User is logged in successfully");
	    }
	    else {
	    	System.out.println("User is not logged in!");
	    }
	    
	    driver.findElement(By.xpath("//li/a[contains(text(),'Delete Account')]")).click();
	    Thread.sleep(3000);
	    
	    String xpath5 = "//h2/b";
	    WebElement element5 = driver.findElement(By.xpath(xpath5));
	    if(element5.isDisplayed()&&element5.getText().equals("ACCOUNT DELETED!")) {
	    	System.out.println("Account is deleted successfully");
	    }else {
	    	System.out.println("Account is not deleted");
	    }
	    driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	    Thread.sleep(3000);

	    driver.close();
	    
	}

}
