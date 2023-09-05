package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		https://jqueryui.com/slider/
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		//div[@id='slider']/span
		WebElement ele = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act = new Actions(driver);
		
//		driver.switchTo().frame(0);
		act.moveToElement(ele, 300, 0).build().perform();

	}

}
