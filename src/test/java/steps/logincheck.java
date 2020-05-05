package steps;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logincheck {

	public ChromeDriver driver;

	@Given("Launch the chrome browser")
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Load the url next")
	public void Loadurl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Set the timeout")
	public void timeouts()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}

	@And("Maximize the window")
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}

	@Given("Enter the usrname as (.*)")
	public void enterUsername(String uname)
	{

		driver.findElementById("username").sendKeys(uname);
	}

	@And("Enter the pasword as (.*)")
	public void enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click the Login button")
	public void clickLogin()

	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify Homepage is displayed")
	public void success()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Home"))
			System.out.println("Login successful");
	}

	@Then("Verify error message")
	public void failed()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Home"))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}

	}
}
