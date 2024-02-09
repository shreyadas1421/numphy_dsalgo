package dsalgo_stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import dsalgoPOM.GraphPage;
import dsalgoPOM.QueuePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoGraphStepDefinition {
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

@When("user clicks on Graph Get Started button")
public void user_clicks_on_graph_get_started_button() {
	GraphPage.getstarted.click();
}

@Given("The user is in the Graph page after logged in")
public void the_user_is_in_the_graph_page_after_logged_in() {
	 System.out.println(DsalgoVariables.Graph_main_page);
	   DriverManager.getDriver().navigate().to(DsalgoVariables.Graph_main_page);
	 UtilityMethods.wait.until(ExpectedConditions.visibilityOf(GraphPage.graph_page));
}
@When("The user clicks {string} link in Graph page")
public void the_user_clicks_link_in_graph_page(String string) {

	GraphPage.graphlink.click();
}

@Then("The user should be directed to {string} page in Graph")
public void the_user_should_be_directed_to_page_in_graph(String string) {
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(GraphPage.graph_page));
	js.executeScript("window.scrollBy(0,250)", "");
	System.out.println("User directed to Graph Page");
	//LOGGER.info("User directed to Queue Operations Page");
}
@When("The user clicks the {string} link in Graph Page")
public void the_user_clicks_the_link_in_graph_page(String string) {
	DriverManager.getDriver().navigate().back();
	js.executeScript("window.scroll(0,0)","");
   GraphPage.graphpracticeqstn.click();
}

@Then("The user should be redirected to  the {string} page in Graph")
public void the_user_should_be_redirected_to_the_page_in_graph(String string) {

	System.out.println("empty");
	String actualurl="https://dsportalapp.herokuapp.com/graph/practice";
	String	expectedurl=DriverManager.getDriver().getCurrentUrl();
	Assert.assertEquals(actualurl, expectedurl);  
}

}
