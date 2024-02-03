package dsalgo_stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSTreeStepDefinition {
	@When("The user clicks the {string} button in Tree Pane or select Tree item from the drop down menu")
	public void the_user_clicks_the_button_in_tree_pane_or_select_tree_item_from_the_drop_down_menu(String getStarted) {
	   
		if(getStarted.equals("Tree Getting Started")) {
		   HomePage.tree_getStarted.click();
	   }
		
	}
	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
		System.out.println(DsalgoVariables.tree_main_page);
	   DriverManager.getDriver().navigate().to(DsalgoVariables.tree_main_page);
	   UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.tree_page));
	}


	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	System.out.println("In Practice Question Page whichis blank");
	}
}