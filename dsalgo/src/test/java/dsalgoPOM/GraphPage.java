package dsalgoPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GraphPage {
	@FindBy(xpath = "//a[@href='graph']")
	public static WebElement getstarted;
	
	@FindBy(xpath = "//h4[text()='Graph']")
	public static WebElement graph_page;
	
	@FindBy(xpath = "//html/body/div[2]/ul[2]/a")
	public static WebElement graphlink;
	
	@FindBy(xpath = "//a[@href='/graph/practice']")
	public static WebElement graphpracticeqstn;
	
}
