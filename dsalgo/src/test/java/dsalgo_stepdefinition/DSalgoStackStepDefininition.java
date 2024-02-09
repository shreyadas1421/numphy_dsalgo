package dsalgo_stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import dsalgoPOM.LinkedList;
import dsalgoPOM.StackPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoStackStepDefininition {
	
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	
	@When("user clicks on Stack Get Started button")
	public void user_clicks_on_stack_get_started_button() {
		StackPage.Getstarted.click();
		
	}

	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
		System.out.println(DsalgoVariables.Stack_main_page);
		   DriverManager.getDriver().navigate().to(DsalgoVariables.Stack_main_page);
		   UtilityMethods.wait.until(ExpectedConditions.visibilityOf(StackPage.stack_page));
		   
		   
	}

	@When("The user clicks {string} link in Stack Page")
	public void the_user_clicks_link_in_stack_page(String string) {
		DriverManager.getDriver().navigate().back();
		js.executeScript("window.scroll(0,0)","");
		StackPage.StackPracQuestion.click();
	}

	@Then("The user should be directed to {string} page in Stack")
	public void the_user_should_be_directed_to_page_in_stack(String string) {
		System.out.println("Empty page");
		String actualurl="https://dsportalapp.herokuapp.com/stack/practice";
		String	expectedurl=DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);  
	}
	
}
