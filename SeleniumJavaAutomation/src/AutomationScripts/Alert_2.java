package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		You selected Cancel
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Java\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		String ExpOK="You selected Ok";
		String ExpCancel="You selected Cancel";
		
		
		//After OK is clicked
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().accept();
		String actText = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		
		if(ExpOK.equals(actText)) {
			System.out.println("test passed");
		}
		
		driver.navigate().refresh();
		
		//Now Cancel is clicked
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
	    actText = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		
		if(ExpCancel.equals(actText)==true) {
		   System.out.println("test passed");	
		}
		
		
		
	}

}
