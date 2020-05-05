package LearnHooks;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public void openApp()

{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
		
	
	public void closeApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
		}
	
	
	



