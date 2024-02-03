package dsalgo_stepdefinition;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dsalgoPOM.LinkedList;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DSalgoLinkListStepDefinition {
	
	String Link_List;
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

@When("user clicks on LinkList Get Started button")
public void user_clicks_on_link_list_get_started_button() {
  LinkedList.getstarted.click();
}

@Given("The user is in the Linked List page after logged in")
public void the_user_is_in_the_linked_list_page_after_logged_in() {
	   System.out.println(DsalgoVariables.LinkedList_mainpage);
	   DriverManager.getDriver().navigate().to(DsalgoVariables.LinkedList_mainpage);
	  UtilityMethods.wait.until(ExpectedConditions.visibilityOf(LinkedList.LinkList));
}

@When("The user clicks {string} link in Linked List Page")
public void the_user_clicks_link_in_linked_list_page(String string) {
	DriverManager.getDriver().navigate().back();
	js.executeScript("window.scroll(0,0)","");
	LinkedList.PracQuestion.click();
}

@Then("The user should be directed to {string} page in Linked List")
public void the_user_should_be_directed_to_page_in_linked_list(String string) {
	System.out.println("empty page");
}
}