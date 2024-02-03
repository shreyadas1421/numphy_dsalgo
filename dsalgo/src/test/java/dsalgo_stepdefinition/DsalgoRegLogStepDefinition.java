package dsalgo_stepdefinition;


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsalgoRegLogStepDefinition{

	private static final Logger LOGGER=LogManager.getLogger(DsalgoRegLogStepDefinition.class);
	
//HomePage//sigin
@Given("The user opens Home Page")
public void the_user_opens_home_page() {
	
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(HomePage.signin_link));
	
}

@When("The user clicks {string} drop down")
public void the_user_clicks_drop_down(String string) {
	System.out.println("inside HomePage");
	HomePage.DS_link.click();
}

@Then("I shouls see {int} different data structure entries in that dropdown")
public void i_shouls_see_different_data_structure_entries_in_that_dropdown(Integer int1) {
	System.out.println("The number of entries present is - "+HomePage.ds_dropdown_entries.size());
	System.out.println("The number of entries present is - "+int1);
	Integer a=HomePage.ds_dropdown_entries.size();
	Assert.assertEquals(a.toString(),int1.toString());
//	Assert.assertEquals(HomePage.ds_dropdown_entries.size(),"6");
}

@Then("The user clicks any of the {string} buttons below the data structures")
public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures(String string) {
	HomePage.get_started.click();
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(HomePage.alert_message));
}

@Then("It should alert the user with a message {string}")
public void it_should_alert_the_user_with_a_message(String string) {
	System.out.println("The alert message - " +HomePage.alert_message.getText());
	Assert.assertEquals(HomePage.alert_message.getText(),"You are not logged in");
}

@When("The user selects any data structures item from the drop down without Sign in.")
public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	HomePage.DS_link.click();
	HomePage.ds_dropdown_entries.get(1).click();
}

//Register
@When("The user clicks {string}")
public void the_user_clicks(String link) {
	//System.out.println("inside page");
	if(link.equals("Register")) {
		HomePage.register_link.click(); 
	}
	else if(link.equals("Sign in")) {
		HomePage.signin_link.click();
	}
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() {
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(RegisterationLoginPage.password1));
	System.out.println("User redirected to Register form ");
}

@When("The user clicks {string} button with all fields empty")
public void the_user_clicks_button_with_all_fields_empty(String string) {
	System.out.println("inside register page");
	RegisterationLoginPage.submit_btn.click();
}

@Then("It should display an error {string} below Username textbox")
public void it_should_display_an_error_below_username_textbox(String string) {
  System.out.println(string);
}

@When("The user clicks {string} button after entering Username with other fields empty")
public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string) {
	LOGGER.info("Entering the Username and Submiting");
	RegisterationLoginPage.username1.sendKeys("sample");
	RegisterationLoginPage.submit_btn.click();
}

@Then("It should display an error {string} below Password textbox")
public void it_should_display_an_error_below_password_textbox(String string) {
	System.out.println(string);
	LOGGER.info(string);
}

@When("The user clicks {string} button after entering Username and password with Password Confirmation field empty")
public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(String string) {
	RegisterationLoginPage.password1.sendKeys("sample");
	RegisterationLoginPage.submit_btn.click();
   
}

@Then("It should display an error {string} below Password Confirmation textbox")
public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	System.out.println(string);
}



@Then("It should display an error message {string}")
public void it_should_display_an_error_message(String string) {
 if (HomePage.alert_message.isDisplayed()) {
	 System.out.println(string);
 }
}

@When("The user clicks {string} button after entering {string} {string} in username and password field and different password in Password Confirmation fields")
public void the_user_clicks_button_after_entering_in_username_and_password_field_and_different_password_in_password_confirmation_fields(String string, String userName, String passwordReg) {
	RegisterationLoginPage.username1.sendKeys(userName);
	RegisterationLoginPage.password1.sendKeys(passwordReg);
	RegisterationLoginPage.password2.sendKeys("12345");
	RegisterationLoginPage.submit_btn.click();
}
@When("The user clicks {string} button after entering {string} and {string} in text fields")
public void the_user_clicks_button_after_entering_and_in_text_fields(String string, String userName, String passwordReg) {
	RegisterationLoginPage.username1.clear();
	RegisterationLoginPage.password1.clear();
	RegisterationLoginPage.username1.sendKeys(userName);
	RegisterationLoginPage.password1.sendKeys(passwordReg);
	RegisterationLoginPage.password2.sendKeys(passwordReg);
	RegisterationLoginPage.submit_btn.click();
 
}

@Then("It should redirected to homepage.")
public void it_should_redirected_to_homepage() {
 System.out.println("Redirected to HomePage");
 UtilityMethods.wait.until(ExpectedConditions.visibilityOf(HomePage.signout_link));
 
}


@Then("The user land on Login Page")
public void the_user_land_on_login_page() {
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(RegisterationLoginPage.password));
	System.out.println("Inside Login Page");
	LOGGER.info("Inside Login Page");
}

@When("The user clicks {string} button with {string} Username and password fields empty")
public void the_user_clicks_button_with_username_and_password_fields_empty(String string, String loginUsername) {
	RegisterationLoginPage.username.sendKeys(loginUsername);
	RegisterationLoginPage.submit_btn.click();
}

@When("The user clicks {string} button after entering {string} and {string} in username and password fields")
public void the_user_clicks_button_after_entering_and_in_username_and_password_fields(String string, String invalidUsr, String invalidPwd) {
	RegisterationLoginPage.username.clear();
	RegisterationLoginPage.username.sendKeys(invalidUsr);
	RegisterationLoginPage.password.sendKeys(invalidPwd);
	RegisterationLoginPage.submit_btn.click();
  
}

@When("The user clicks {string} button after entering ValidUsername and ValidPassword in username and password fields")
public void the_user_clicks_button_after_entering_in_username_and_password_fields(String string) {
	RegisterationLoginPage.username.sendKeys(DsalgoVariables.username);
	RegisterationLoginPage.password.sendKeys(DsalgoVariables.password);
	RegisterationLoginPage.submit_btn.click();
}


}