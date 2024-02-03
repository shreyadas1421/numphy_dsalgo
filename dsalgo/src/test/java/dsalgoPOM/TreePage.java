package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class TreePage {

	@FindBy(xpath = "//h4[text()='Tree']")
	public static WebElement tree_page;
	//overview-of-trees 'u"+s+"' DsalgoVariables.treePagelinks
	//@FindBy(xpath = "//a[@href='"+DsalgoVariables.treePagelinks+"']")
	//public static WebElement overview_tree;
	
//	@FindBy(xpath = "//p[text()='Overview of Trees']")
//	public static WebElement overview_tree_page;
	
	//common used
	@FindBy(xpath = "//a[@href='/tryEditor']")
	public static WebElement tryHere_button;
	@FindBy(xpath="//*[@class='input']")
	public static WebElement Texteditor;
	@FindBy(xpath="//pre[@role='presentation']")
	public static WebElement Texteditor1;
	@FindBy(xpath = "//button[text()='Run']")
	public static WebElement run_button;
	@FindBy(id = "output")
	public static WebElement output;
	//Common used
	
//	@FindBy(xpath = "//a[@href='terminologies']")
//	public static WebElement terminology;
	
//	@FindBy(xpath = "//p[text()='Terminologies']")
//	public static WebElement terminology_tree_page;
	
	
	public static void commonxpathclick(String treePagelinks ) {
		WebElement commonLink=DriverManager.getDriver().findElement(By.xpath("//a[@href='"+treePagelinks+"']"));
		commonLink.click();
	}
	
	public static WebElement commonxpathtext(String treePageCheck ) {
		WebElement pageCheck=DriverManager.getDriver().findElement(By.xpath("//p[text()='"+treePageCheck+"']"));
		return pageCheck;
		
	}
}
 	 	