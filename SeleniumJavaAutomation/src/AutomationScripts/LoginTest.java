package AutomationScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver" ,"C:\\Program Files\\Java\\drivers\\EdgeDriver.exe" );
//		WebDriver driver = new EdgeDriver();
		
//		System.setProperty("webdriver.gecko.driver" ,"C:\\Program Files\\Java\\drivers\\geckodriver.exe" );
//		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "https://practicetestautomation.com/practice-test-login/";
		
		driver.get(baseUrl);	
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));			
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.id("submit"));	
		
		username.sendKeys("student");	
		Thread.sleep(2000);
		
		password.sendKeys("Password123");
		Thread.sleep(2000);
		
		submitButton.click();
		
		String actualUrlAfterLogin = driver.getCurrentUrl();
		String expectedUrlAfterLogin = "https://practicetestautomation.com/logged-in-successfully/";
		
		if(expectedUrlAfterLogin.equals(actualUrlAfterLogin))
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Failed");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		
		
	}

}
