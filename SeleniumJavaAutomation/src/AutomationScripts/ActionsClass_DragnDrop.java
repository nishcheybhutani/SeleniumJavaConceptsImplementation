package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(ele, target).build().perform();
		
	//act.clickAndHold(ele).moveToElement(target).release().build().perform();
		
	
		
		
		
	}

}
