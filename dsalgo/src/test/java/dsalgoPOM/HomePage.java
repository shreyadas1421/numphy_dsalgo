package dsalgoPOM;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage{

		//HomePage
		@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
		public static WebElement DS_link;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
		public static List<WebElement> ds_dropdown_entries;
		@FindBy(xpath = "//a[text()='Get Started']")
		public static WebElement get_started;
		@FindBy(xpath = "//div[@class='alert alert-primary']")
		public static WebElement alert_message;
		
		//Registration
		@FindBy(xpath = "//a[text()=' Register ']")
		public static WebElement register_link;
		
		
		//Sign in
		@FindBy(xpath = "//a[text()='Sign in']")
		public static WebElement signin_link;
		
		
		//Sign Out
		@FindBy(xpath = "//a[text()='Sign out']")
		public static WebElement signout_link;
		
		//Tree
		
		@FindBy(xpath = "//a[@href='tree']")
		public static WebElement tree_getStarted;
}