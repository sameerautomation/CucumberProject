package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps 
{

	public WebDriver driver;
	
	
	@Given("i am at signin page")
	public void i_am_at_signin_page() 
	{
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}

	@When("i entered username as {string}")
	public void i_entered_username_as(String username) 
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("i entered password as {string}")
	public void i_entered_password_as(String password) 
	{
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("i click on sigin button")
	public void i_click_on_sigin_button() throws InterruptedException 
	{
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
	    Thread.sleep(5000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String exptitle) 
	{
		String acttitle=driver.getTitle();
		Assert.assertEquals(exptitle, acttitle);
		driver.quit();
	}
	
}
