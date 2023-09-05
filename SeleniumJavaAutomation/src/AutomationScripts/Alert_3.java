package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		driver.switchTo().alert().sendKeys("Nishchey");
		driver.switchTo().alert().accept();
		
		String exp = "You entered Nishchey";
		
		String act = driver.findElement(By.xpath("	//span[@id='promptResult']")).getText();
		
		if(act.equals(exp)) {
			System.out.println("Test Passed");
		}
	}

}
