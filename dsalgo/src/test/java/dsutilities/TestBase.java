package dsutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.PageFactory;

import dsalgoPOM.ArrayPage;
import dsalgoPOM.Datastructures;
import dsalgoPOM.GraphPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.LinkedList;
import dsalgoPOM.QueuePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.StackPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;

public class TestBase {

	
	public static Properties prop;

	
	public static void loadProperties() {
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("src/test/resources/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DsalgoVariables.browser=prop.getProperty("browser");
		DsalgoVariables.URL=prop.getProperty("url");
		DsalgoVariables.username=prop.getProperty("username");
		DsalgoVariables.password=prop.getProperty("password");

	}
	
	public static void initElements() {
		PageFactory.initElements(DriverManager.getDriver(),HomePage.class);
		PageFactory.initElements(DriverManager.getDriver(),RegisterationLoginPage.class);
		PageFactory.initElements(DriverManager.getDriver(),Datastructures.class);
		PageFactory.initElements(DriverManager.getDriver(),TreePage.class);
		PageFactory.initElements(DriverManager.getDriver(),ArrayPage.class);
		PageFactory.initElements(DriverManager.getDriver(),LinkedList.class);
		PageFactory.initElements(DriverManager.getDriver(),QueuePage.class);
		PageFactory.initElements(DriverManager.getDriver(),StackPage.class);
		PageFactory.initElements(DriverManager.getDriver(),GraphPage.class);
	}

	
	
}