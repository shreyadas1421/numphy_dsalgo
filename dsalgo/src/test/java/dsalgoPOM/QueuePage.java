package dsalgoPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePage {
	@FindBy(xpath = "//a[@href='queue']")
	public static WebElement getstarted;
	
	@FindBy(xpath = "//h4[text()='Queue']")
	public static WebElement queue;
	
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	public static WebElement  QueueInPython;
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	public static WebElement Try;
	
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	public static WebElement CollectionQueue;
	
	@FindBy(xpath = "//a[text()='Implementation using array']")
	public static WebElement Array;
	
	@FindBy(xpath = "//a[text()='Queue Operations']")
	public static WebElement QueueOp;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public static WebElement PracQuestion;
	
	
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea")
	public static WebElement editor;
	@FindBy(xpath = "//button[@onclick='runit()']")
	public static WebElement run;
	
}
