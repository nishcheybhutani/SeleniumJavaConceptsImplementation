package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver" ,"C:\\Program Files\\Java\\drivers\\IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");

	}

}
