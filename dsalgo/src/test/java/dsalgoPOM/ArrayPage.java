package dsalgoPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgo_stepdefinition.DsalgoRegLogStepDefinition;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;

//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayPage {

	private static final Logger LOGGER=(Logger) LogManager.getLogger(DsalgoRegLogStepDefinition.class);
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	static Actions action =new Actions(DriverManager.getDriver());
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	@FindBy(xpath="//a[@href='array']")
	public 	static WebElement Getstarted;

	@FindBy(xpath="//h4[text()='Array']")
	public 	static WebElement Arraytext;
	
	@FindBy(xpath="//a[@href='/array/practice']")
	public 	static WebElement practicequestions_array;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement submitbutton;
	
	@FindBy(xpath="//*[@class='input']")
	public static WebElement Texteditor;
	
	@FindBy(xpath="//div[@class='CodeMirror-lines']")
	public static WebElement Texteditor1;
	
	
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea")
	public static WebElement Texteditor2;
	
	public static void arraypracticelink() {
		DsalgoVariables.path="src/test/resources/TestData/dsAlgoTestData.xlsx";
		File excelFile=new File(DsalgoVariables.path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=workbook.getSheet("PythonArray");
		System.out.println(sheet.getLastRowNum());
		
		int endRow = sheet.getLastRowNum();
		System.out.println(endRow);
		//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.Texteditor1));
		ArrayPage.Texteditor1.click();
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		for (int i = 1; i <=endRow; i++) {
			Cell c1 = sheet.getRow(i).getCell(0);
			DsalgoVariables.python_code=c1.getStringCellValue();
			System.out.println(DsalgoVariables.python_code);
			
			action.sendKeys(DsalgoVariables.python_code).perform();
			action.sendKeys(Keys.ENTER).perform();
			action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).sendKeys(Keys.DELETE).perform();
				
	}

	}
}

