package dsalgo_stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import dsalgoPOM.ArrayPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoArrayStepDefinition {

	String array_page;
	 String arraypracticepage;	
	
	@When("user clicks on Array Get Started button")
	public void user_clicks_on_array_get_started_button() {
		ArrayPage.Getstarted.click();
	    
	}

	/*
	 * @Then("The user should be directed to Array Page") public void
	 * the_user_should_be_directed_to_array_page() {
	 * System.out.println("User directed to Array Page");
	 * //LOGGER.info("User directed to Array Page");
	 * array_page=DriverManager.getDriver().getCurrentUrl();
	 * System.out.println(array_page); }
	 */

	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {
		DriverManager.getDriver().navigate().to(DsalgoVariables.Array_main_page);
		
	}

	@When("The user clicks the back button")
	public void the_user_clicks_the_back_button() {
	   System.out.println("user cicks back button");
		DriverManager.getDriver().navigate().back();
	}
	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Applications of Array")));
		ArrayPage.practicequestions_array.click();
	  //String arraypracticepage = DriverManager.getDriver().getCurrentUrl();
	}


	@Then("The user should be redirected to  the {string} page in Array")
	public void the_user_should_be_redirected_to_the_page_in_array(String string) {
		 arraypracticepage = DriverManager.getDriver().getCurrentUrl();
		 System.out.println(arraypracticepage);
	}


	@Then("The user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String string) {
	   
		
	  ArrayPage.arraypracticelink();
	  TreePage.run_button.click();
	  ArrayPage.submitbutton.click();
	}
	@Given("The user is in the Practice Page")
	public void the_user_is_in_the_practice_page() {
	    DriverManager.getDriver().navigate().to(arraypracticepage);
	}
}