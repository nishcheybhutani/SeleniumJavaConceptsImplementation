package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Resizeable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//https://jqueryui.com/resizable/
		
		driver.get("https://jqueryui.com/resizable/");
		
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 50, 100).build().perform();
		Thread.sleep(3000);
	}

}
