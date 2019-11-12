package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 
{
	WebDriver driver;
	@Given("User opens the IE browser and launches the  TestMe application")
	public void user_opens_the_IE_browser_and_launches_the_TestMe_application() 
	{
	   System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	   driver=new InternetExplorerDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:8083/TestMeApp");
	   driver.findElement(By.linkText("SignUp")).click();
	   Assert.assertTrue(driver.getTitle().contains("Sign Up"));
	}

	@When("User enters Username as {string} in usename field")
	public void user_enters_Username_as_in_usename_field(String uname) 
	{
	   System.out.println("UserName");
	   driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@When("User enters Firstname as {string} in firstname field")
	public void user_enters_Firstname_as_in_firstname_field(String fname) 
	{
		 System.out.println("FirstName");
		   driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("User enters Lastname as {string} in lastname field")
	public void user_enters_Lastname_as_in_lastname_field(String lname) 
	{
		 System.out.println("LastName");
		   driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("User enters Password as {string} in password field")
	public void user_enters_Password_as_in_password_field(String pwd) 
	{
		 System.out.println("Password");
		   driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("User enters Confirm Password as {string} in confirm password field")
	public void user_enters_Confirm_Password_as_in_confirm_password_field(String cpwd) 
	{
		 System.out.println("Confirm");
		   driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	}

	@When("user selects gender as Female from the gender field")
	public void user_selects_gender_as_Female_from_the_gender_field() 
	{
	   
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enters the EmailID {string} as in email field")
	public void user_enters_the_EmailID_as_in_email_field(String email)
	{
	  driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enters the Mobile number {string} in mobile number field")
	public void user_enters_the_Mobile_number_in_mobile_number_field(String mob) 
	{
	   driver.findElement(By.name("mobileNumber")).sendKeys(mob);
	}

	@When("user selects the DOB {string} from DOB field")
	public void user_selects_the_DOB_from_DOB_field(String dob) 
	{
		 driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enters the Address as {string} in address field")
	public void user_enters_the_Address_as_in_address_field(String add) 
	{
		 driver.findElement(By.name("address")).sendKeys(add);
	}

	@When("user selects security as {string} question")
	public void user_selects_security_as_question(String string) 
	{
	    Select sq= new Select(driver.findElement(By.name("securityQuestion")));
	    sq.selectByIndex(1);
	}

	@When("user enters the Answer as {string}  in answer field")
	public void user_enters_the_Answer_as_in_answer_field(String ans) 
	{
		driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@When("user clicks on register")
	public void user_clicks_on_register() 
	{
		driver.findElement(By.name("Submit")).click();
	}

	@Then("user registration is successful")
	public void user_registration_is_successful() 
	{
		   System.out.println("Registration done");
		   Assert.assertTrue(driver.getTitle().contains("Login"));
	}

}
