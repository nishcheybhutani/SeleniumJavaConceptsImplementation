package AutomationScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//xpath?below
		// //a[@href='http://www.selenium.dev']/button[contains(text(),'click')]
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();

		System.out.println(driver.getTitle());//driver is still at prev page
		
		Set <String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
			System.out.println(i);//pehele curr window ka then next window ka
			String t= driver.switchTo().window(i).getTitle();//if pass 1 then directly opened window pr switch
			
			System.out.println(t);
		}
		
	}
}
		
