package dsalgo_webdriver_manager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import dsutilities.DsalgoVariables;

public class DriverManager {
	
	
	private static WebDriver driver;
	public static ChromeOptions co=new ChromeOptions();;
	
	
	private static final Logger LOGGER=LogManager.getLogger(DriverManager.class);
	
	public static void launchBrowser() {
		// TODO Auto-generated method stub
		
		switch (DsalgoVariables.browser) {
		case "chrome":
			LOGGER.info("Launching -" +DsalgoVariables.browser);
			co.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver=new ChromeDriver(co);
			break;
		case "firefox":
			LOGGER.info("Launching -" +DsalgoVariables.browser);
			driver=new FirefoxDriver();
			break;
		case "safari":
			LOGGER.info("Launching -" +DsalgoVariables.browser);
			driver=new SafariDriver();
			break;	
		case "edge":
			LOGGER.info("Launching -" +DsalgoVariables.browser);
			driver=new EdgeDriver();
			break;	
		default:
			LOGGER.info("Launching -" +DsalgoVariables.browser);
			driver=new ChromeDriver();
			break;
		}
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
}