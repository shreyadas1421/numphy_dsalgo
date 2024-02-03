package dsalgoPOM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Datastructures {
	@FindBy(xpath = "//a[@href=\'data-structures-introduction\']")
	public static WebElement getstarted;
	
	
	@FindBy(xpath = "//a[text()='Time Complexity']")
	public static WebElement Timecomplexity;

	
	@FindBy(xpath = "//button[text()='Run']")
	public static WebElement Runbutton;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public static WebElement practicequestions;
}
	
////div[@class='CodeMirror-scroll']