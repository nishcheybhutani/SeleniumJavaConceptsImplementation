package AutomationScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		//button[@id='windowButton']
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		String mainwindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String i : allWindowHandles) {
			if(!mainwindowHandle.equalsIgnoreCase(i))
			{
				driver.switchTo().window(i);
//				System.out.println(driver.getTitle());
				
				String s = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				System.out.println(s);
			}
		}
	}

}
