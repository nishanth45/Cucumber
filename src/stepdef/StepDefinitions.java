package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver=null;
	
	@Given("^user navigates to Pega Website$")
	public void user_navigates_to_Pega_Website()  {
	   System.setProperty("webdriver.gecko.driver", "../Cucumber/Browsers/geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.get("http://training.openspan.com/login");
	}

	@When("^user logs in using Username as \"(.*?)\"$")
	public void user_logs_in_using_Username_as(String username) {
	   driver.findElement(By.id("user_name")).sendKeys(username);
	}

	@And("^password as \"(.*?)\"$")
	public void password_as(String password)  {
	 driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	@Then("^login should be successful$")
	public void login_should_be_successful()  {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	}

	@And("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	   String title=driver.getTitle();
	   
	   System.out.println("Title is : : " + title);
	}
	
	

	
	
	

}
