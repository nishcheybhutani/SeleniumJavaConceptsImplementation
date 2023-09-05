package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		act.contextClick(button).build().perform();
		
		//li/span[contains(text(),'Edit')]
		driver.findElement(By.xpath("//li/span[contains(text(),'Edit')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();


	}

}
