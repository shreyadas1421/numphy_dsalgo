package dsalgo_stepdefinition;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.TestBase;
import dsutilities.UtilityMethods;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DSalgoBaseStepDefinition {


	
	private static final Logger LOGGER=LogManager.getLogger(DSalgoBaseStepDefinition.class);
	
	@Before
	public static void beforeScenario() {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Loading the Property File");
			TestBase.loadProperties();
			
				DriverManager.launchBrowser();
				TestBase.initElements();
				
			
		}
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		try {
			
			launchURL();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

	public static void launchURL() {
		DriverManager.getDriver().get(DsalgoVariables.URL);
		DriverManager.getDriver().manage().window().maximize();
		System.out.println("Launched the DSalgo website");
		
	}
	
	public static void Login() {
		HomePage.signin_link.click();
		RegisterationLoginPage.username.sendKeys(DsalgoVariables.username);
		RegisterationLoginPage.password.sendKeys(DsalgoVariables.password);
		RegisterationLoginPage.submit_btn.click();
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(HomePage.signout_link));
	}
	
//	public static void TextIndentation(int row, int space,boolean flag) {
//		
//	       // Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
//		for(int i=1;i<=row;i++) {
//		      UtilityMethods.action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
//		       for(int j=1;j<=space;j++) {
//	            if(i==1 && flag) UtilityMethods.action.sendKeys(Keys.BACK_SPACE).perform();
//	            else UtilityMethods.action.sendKeys(Keys.DELETE).perform();
//			   }
//		}
//	}
	
@After
public void driverClose() {
	DriverManager.getDriver().close();
}

@AfterStep
public void attach_screenshot(Scenario scenario) {
	if(scenario.isFailed()) {
	byte[] screenshottaken= ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshottaken, "image/png", "errorscreen");
	
	
	}
}
}