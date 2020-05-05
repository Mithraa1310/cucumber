package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Createleadpositive {

	public ChromeDriver driver;

	@Given("Launch the browser")
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Load the url")
	public void Loadurl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Set the timeouts")
	public void timeouts()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}

	@And("Maximize the browser")
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}

	@And("Enter the username as (.*)")
	public void enterUsername(String uname)
	{

		driver.findElementById("username").sendKeys(uname);
	}

	@And("Enter the password as (.*)")
	public void enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("Click on the Login button")
	public void clickLogin()

	{
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click CRMSFA Link")
	public void clickcrmlink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click Leads")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click createLead")
	public void clickcreatelead()
	{
		driver.findElementByPartialLinkText("Create Lead").click();
	}

	@And("Enter Company Name as (.*)")
	public void entercompname(String cname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@And("Enter first Name as (.*)")
	public void enterfirstname(String fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@And("Enter last Name as (.*)")
	public void enterlastname(String lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("clicking on Create Lead button")	
	public void clickcreatebutton()
	{
		driver.findElementByName("submitButton").click();

	}

	@Then ("Verify view Lead is displayed")
	public void verifycreate()
	{
		String title =driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		System.out.println(title);
	}
























}
