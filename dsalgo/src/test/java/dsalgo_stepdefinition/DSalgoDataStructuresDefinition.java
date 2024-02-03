package dsalgo_stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import dsalgoPOM.Datastructures;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoDataStructuresDefinition {
	JavascriptExecutor js= (JavascriptExecutor) DriverManager.getDriver();
	@When("user clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		Datastructures.getstarted.click();
	}

	@Then("user should land in {string}")
	public void user_should_land_in(String string) {
		String actualurl="https://dsportalapp.herokuapp.com/data-structures-introduction/";	
		String	expectedurl=DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);  
	}

	@Given("user is in the Data Structures-Introduction page")
	public void user_is_in_the_data_structures_introduction_page() {
		
		 js.executeScript("window.scrollTo(0,document.body.height)", "");
			
	}

	
}