package dsalgoPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StackPage {
	
	@FindBy(xpath="//a[@href='stack']")
	public 	static WebElement Getstarted;
	
	@FindBy(xpath="//h4[text()='Stack']")
	public 	static WebElement stack_page;
	
	@FindBy(xpath="//a[text()='Operations in Stack']")
	public 	static WebElement Operations_in_Stack;
	
	@FindBy(xpath="//a[text()='Implementation']")
	public 	static WebElement Implementation;
	
@FindBy(xpath = "//a[text()='Practice Questions']")
	
	public static WebElement StackPracQuestion;
}
