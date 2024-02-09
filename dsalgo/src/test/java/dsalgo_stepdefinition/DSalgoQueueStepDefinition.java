package dsalgo_stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import dsalgoPOM.LinkedList;
import dsalgoPOM.QueuePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoQueueStepDefinition {

	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


@When("user clicks on Queue Get Started button")
public void user_clicks_on_queue_get_started_button() {

	QueuePage.getstarted.click();
}

@Given("The user is in the Queue page after logged in")
public void the_user_is_in_the_queue_page_after_logged_in() {
	 System.out.println(DsalgoVariables.Queue_Page);
	   DriverManager.getDriver().navigate().to(DsalgoVariables.Queue_Page);
	  UtilityMethods.wait.until(ExpectedConditions.visibilityOf(QueuePage.queue));
}

@When("The user clicks the {string} link in Queue Page")
public void the_user_clicks_the_link_in_queue_page(String string) {
	DriverManager.getDriver().navigate().back();
	js.executeScript("window.scroll(0,0)","");
	LinkedList.PracQuestion.click();
}

@Then("The user should be redirected to  the {string} page in Queue")
public void the_user_should_be_redirected_to_the_page_in_queue(String string) {
	String actualurl="https://dsportalapp.herokuapp.com/queue/practice";
	String	expectedurl=DriverManager.getDriver().getCurrentUrl();
	Assert.assertEquals(actualurl, expectedurl);  
}
}