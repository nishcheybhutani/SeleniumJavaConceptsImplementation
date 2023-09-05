package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver" ,"C:\\Program Files\\Java\\drivers\\EdgeDriver.exe" );
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		

	}

}
