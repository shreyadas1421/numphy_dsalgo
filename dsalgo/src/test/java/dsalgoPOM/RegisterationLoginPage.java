package dsalgoPOM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterationLoginPage{


	//Registeration
	@FindBy(name = "username")
	public static WebElement username1;
	@FindBy(name = "password1")
	public static WebElement password1;
	@FindBy(name = "password2")
	public static WebElement password2;
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement submit_btn;
	//reuse alert_message
	
	//Login
	@FindBy(name = "username")
	public static WebElement username;
	@FindBy(name = "password")
	public static WebElement password;
	//reuse submit_btn
	//alert_message
}