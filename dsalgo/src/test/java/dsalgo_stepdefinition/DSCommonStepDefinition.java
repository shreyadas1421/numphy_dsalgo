package dsalgo_stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoPOM.ArrayPage;
import dsalgoPOM.GraphPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.LinkedList;
import dsalgoPOM.QueuePage;
import dsalgoPOM.StackPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.UtilityMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSCommonStepDefinition {

	private static final Logger LOGGER=LogManager.getLogger(DsalgoRegLogStepDefinition.class);
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	Actions action =new Actions(DriverManager.getDriver());
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));

@Given("The user is in the Home page after logged in")
public void the_user_is_in_the_home_page_after_logged_in() {
	System.out.println("In Step_Definition");
   UtilityMethods.wait.until(ExpectedConditions.visibilityOf(HomePage.signin_link));
   
   DSalgoBaseStepDefinition.Login();
}



@Then("The user should be directed to {string} Page")
public void the_user_should_be_directed_to_page(String new_page) {
	if(new_page.equals("Tree")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.tree_page));
		System.out.println("User directed to Tree Page");
		LOGGER.info("User directed to Tree Page");
		DsalgoVariables.tree_main_page=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.tree_main_page);
	}
	
	else if (new_page.equals("Overview of Trees")) {
		js.executeScript("window.scrollBy(0,250)", "");
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Overview of Trees")));
		System.out.println("User directed to OverviewTree Page");
		LOGGER.info("User directed to OverviewTree Page");
	}
	else if (new_page.equals("Terminologies")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Terminologies")));
		System.out.println("User directed to Terminologies Page");
		LOGGER.info("User directed to Terminologies Page");
	}
	else if (new_page.equals("Types of Trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Types of Trees")));
		System.out.println("User directed to Types of Trees Page");
		LOGGER.info("User directed to Types of Trees Page");
	}
	else if (new_page.equals("Tree Traversals")) {
		js.executeScript("window.scrollBy(0,250)", "");
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Tree Traversals")));
		System.out.println("User directed to Tree Traversals Page");
		LOGGER.info("User directed to Tree Traversals Page");
	}
	else if (new_page.equals("Traversals-Illustration")) {
		js.executeScript("window.scrollBy(0,250)", "");
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Traversals-Illustration")));
		System.out.println("User directed to Traversals-Illustration Page");
		LOGGER.info("User directed to Traversals-Illustration Page");
	}
	else if (new_page.equals("Binary Trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Binary Trees")));
		System.out.println("User directed to Binary Trees Page");
		LOGGER.info("User directed to Binary Trees Page");
	}
	else if (new_page.equals("Types of Binary Trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Types of Binary Trees")));
		System.out.println("User directed to Types of Binary Trees Page");
		LOGGER.info("User directed to Types of Binary Trees Page");
	}
	else if (new_page.equals("Implementation in Python")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation in Python Page");
		LOGGER.info("User directed to Implementation in Python Page");
	}
	else if (new_page.equals("Binary Tree Traversals")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Binary Tree Traversals")));
		System.out.println("User directed to Binary Tree Traversals Page");
		LOGGER.info("User directed to Binary Tree Traversals Page");
	}
	else if (new_page.equals("Implementation of Binary Trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation of Binary Trees")));
		js.executeScript("window.scrollBy(0,450)", "");
		System.out.println("User directed to Implementation of Binary Trees Page");
		LOGGER.info("User directed to Implementation of Binary Trees Page");
	}
	else if (new_page.equals("Applications of Binary trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Applications of Binary trees")));
		System.out.println("User directed to Applications of Binary trees Page");
		LOGGER.info("User directed to Applications of Binary trees Page");
	}
	else if (new_page.equals("Binary Search Trees")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Binary Search Trees")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Binary Search Trees Page");
		LOGGER.info("User directed to Binary Search Trees Page");
	}
	else if (new_page.equals("Implementation Of BST")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
		System.out.println("User directed to Implementation Of BST Page");
		LOGGER.info("User directed to Implementation Of BST Page");
	}
	else if (new_page.equals("Time complexity")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Time complexity")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Time complexity Page");
		LOGGER.info("User directed to Time complexity Page");
	}
	else if(new_page.equals("Array")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(ArrayPage.Arraytext));
		System.out.println("User directed to Array Page");
		LOGGER.info("User directed to array Page");
		DsalgoVariables.Array_main_page=DriverManager.getDriver().getCurrentUrl();
		//System.out.println(DsalgoVariables.tree_main_page);
	
	}
	else if (new_page.equals("Arrays in Python")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Arrays in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Arrays in Python Page");
		LOGGER.info("User directed to Arrays in Python");
	}
	else if (new_page.equals("Arrays using List")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Arrays Using List")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Arrays Using List Page");
		LOGGER.info("User directed to Arrays Using List");
	}
	else if (new_page.equals("Basic Operations in Lists")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Basic Operations in Lists")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Basic Operations in Lists Page");
		LOGGER.info("User directed to Basic Operations in Lists");
	}
	else if (new_page.equals("Applications of Array")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Applications of Array")));
		
		System.out.println("User directed to Applications of Array Page");
		LOGGER.info("User directed to Applications of Array");
	}
	//**Linked List ***
	else if(new_page.equals("Linked List")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(LinkedList.LinkList));
		System.out.println("User directed to Linked List Page");
		LOGGER.info("User directed to Linked List Page");
		DsalgoVariables.LinkedList_mainpage=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.LinkedList_mainpage);
	}

	else if(new_page.equals("Introduction")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Introduction")));
		System.out.println("User directed to Introduction Page");
		LOGGER.info("User directed to Introduction Page");
		
	}
	else if(new_page.equals("Creating Linked LIst")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Creating Linked LIst")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Creating Linked LIst Page");
		LOGGER.info("User directed to Creating Linked LIst Page");
		
	}
	else if(new_page.equals("Types of Linked List")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Types of Linked List")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Types of Linked List Page");
		LOGGER.info("User directed to Types of Linked List Page");
		
	}
	else if(new_page.equals("Implement Linked List in Python")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implement Linked List in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implement Linked List in Python Page");
		LOGGER.info("User directed to Implement Linked List in Python Page");
		
	}
	else if(new_page.equals("Traversal")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Traversal")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Traversal Page");
		LOGGER.info("User directed to Traversal Page");
		
	}
	else if(new_page.equals("Insertion")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Insertion")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Insertion Page");
		LOGGER.info("User directed to Insertion Page");
		
	}
	else if(new_page.equals("Deletion")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Deletion")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Deletion Page");
		LOGGER.info("User directed to Deletion Page");
		
	}
	
	else if(new_page.equals("Queue")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(QueuePage.queue));
		System.out.println("User directed to Queue Page");
		LOGGER.info("User directed to Queue Page");
		DsalgoVariables.Queue_Page=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.Queue_Page);
	}
	
	else if(new_page.equals("Implementation using collections.deque")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation using collections.deque")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation using collections deque Page");
		LOGGER.info("User directed to Implementation using collections.deque Page");
		
	}
	else if(new_page.equals("Implementation using array")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation using array")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation using array Page");
		LOGGER.info("User directed to Implementation using array Page");
		
	}
	else if(new_page.equals("Queue Operations")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Queue Operations")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Queue Operations Page");
		LOGGER.info("User directed to Queue Operations Page");
		
	}
	else if(new_page.equals("Stack")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(StackPage.stack_page));
		System.out.println("User directed to Stack Page");
		LOGGER.info("User directed to Stack Page");
		DsalgoVariables.Stack_main_page=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.Stack_main_page);
	}

	else if(new_page.equals("Operations in Stack")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Operations in Stack")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Operations in Stack Page");
		LOGGER.info("User directed to Operations in Stack Page");
		
	}
	else if(new_page.equals("Implementation")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation Page");
		LOGGER.info("User directed to Implementation Page");
		
	}
	else if(new_page.equals("Applications")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Applications")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Applications Page");
		LOGGER.info("User directed to Applications Page");
		
	}
	else if(new_page.equals("Graph")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(GraphPage.graph_page));
		System.out.println("User directed to Graph Page");
		LOGGER.info("User directed to Graph Page");
		DsalgoVariables.Graph_main_page=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.Graph_main_page);
	}
	
	else if(new_page.equals("Graph Representations")) {
		UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Graph Representations")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Graph Representations Page");
		LOGGER.info("User directed to Graph Representations Page");
		
	}
}

@When("The user clicks {string} link")
public void the_user_clicks_link(String common_link) {
    if(common_link.equals("Overview of Trees")) {
    	TreePage.commonxpathclick("overview-of-trees");
    }
   
    else if (common_link.equals("Terminologies")) {
    	TreePage.commonxpathclick("terminologies");
	}
    else if (common_link.equals("Types of Trees")) {
    	TreePage.commonxpathclick("types-of-trees");
	}
    else if (common_link.equals("Tree Traversals")) {
    	TreePage.commonxpathclick("tree-traversals");
	}
    else if (common_link.equals("Traversals-Illustration")) {
    	TreePage.commonxpathclick("traversals-illustration");
	}
    else if (common_link.equals("Binary Trees")) {
    	TreePage.commonxpathclick("binary-trees");
	}
    else if (common_link.equals("Types of Binary Trees")) {
    	TreePage.commonxpathclick("types-of-binary-trees");
	}
    else if (common_link.equals("Implementation in Python")) {
    	TreePage.commonxpathclick("implementation-in-python");
	}
    else if (common_link.equals("Binary Tree Traversals")) {
    	TreePage.commonxpathclick("binary-tree-traversals");
	}
    else if (common_link.equals("Implementation of Binary Trees")) {
    	TreePage.commonxpathclick("implementation-of-binary-trees");
	}
    else if (common_link.equals("Applications of Binary trees")) {
    	TreePage.commonxpathclick("applications-of-binary-trees");
	}
    else if (common_link.equals("Binary Search Trees")) {
    	TreePage.commonxpathclick("binary-search-trees");
	}
    else if (common_link.equals("Implementation Of BST")) {
    	TreePage.commonxpathclick("implementation-of-bst");
	}
    else if (common_link.equals("Practice Questions")) {
    	DriverManager.getDriver().navigate().back();
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	TreePage.commonxpathclick("/tree/practice");
	}
    else if (common_link.equals("Time Complexity")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	TreePage.commonxpathclick("time-complexity");
	}
    else if (common_link.equals("Arrays in Python")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	TreePage.commonxpathclick("arrays-in-python");
	}
else if (common_link.equals("Arrays using List")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	TreePage.commonxpathclick("arrays-using-list");
	}
else if (common_link.equals("Basic Operations in Lists")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("basic-operations-in-lists");
}
else if (common_link.equals("Applications of Array")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("applications-of-array");
}
else if (common_link.equals("Search the array")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("/question/1");
}
else if (common_link.equals("Max Consecutive Ones")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("/question/2");
}    
else if (common_link.equals("Find Numbers with Even Number of Digits")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("/question/3");
}    
else if (common_link.equals("Squares of  a Sorted Array")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("/question/4");
} 
    
  //***LinkedList common link***  
else if (common_link.equals("Introduction")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("introduction");
} 
  
else if (common_link.equals("Creating Linked LIst")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("creating-linked-list");
} 
else if (common_link.equals("Types of Linked List")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("types-of-linked-list");
} 
else if (common_link.equals("Implement Linked List in Python")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("implement-linked-list-in-python");
} 
else if (common_link.equals("Traversal")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("traversal");
} 
else if (common_link.equals("Insertion")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("insertion-in-linked-list");
} 
else if (common_link.equals("Deletion")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("deletion-in-linked-list");
} 
    
else if (common_link.equals("Implementation of Queue in Python")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("implementation-lists");
} 
else if (common_link.equals("Implementation using collections.deque")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("implementation-collections");
}
else if (common_link.equals("Implementation using array")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("Implementation-array");
}
else if (common_link.equals("Implementation using array")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("Implementation-array");
}
else if (common_link.equals("Queue Operations")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("QueueOp");
}
else if (common_link.equals("Operations in Stack")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("operations-in-stack");
}
else if (common_link.equals("Implementation")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("implementation");
}
else if (common_link.equals("Applications")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("stack-applications");
}

else if (common_link.equals("Graph Representations")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
	TreePage.commonxpathclick("graph-representations");
}
  
}

//common
@When("The user clicks {string} button")
public void the_user_clicks_button(String try_button) {
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.tryHere_button));
	TreePage.tryHere_button.click();
	
}

//common
@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.Texteditor));
	js.executeScript("window.scrollTo(0,document.body.height)", "");
	System.out.println("User directed to TextEditor Page");
	LOGGER.info("User directed to TextEditor Page");
	
	TreePage.Texteditor.click();
	action.sendKeys("print('Hello')").build().perform();
	TreePage.run_button.click();
	
	TreePage.Texteditor1.click();
	action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	
	action.sendKeys("pri('Hello')").build().perform();
	
	TreePage.run_button.click();
	try {
		wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Python code is incorrect---Enter Correctly");
		LOGGER.info("Python code is incorrect---Enter Correctly");
		Alert alert=DriverManager.getDriver().switchTo().alert();
		alert.accept();
		
	} catch (Exception e) {
	 e.printStackTrace();	
		
	} 
	
	/*finally {
		System.out.println(ExpectedConditions.alertIsPresent());
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
		TreePage.Texteditor1.click();
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		for (int i = 1; i <=endRow; i++) {
			Cell c1 = sheet.getRow(i).getCell(0);
			DsalgoVariables.python_code=c1.getStringCellValue();
			System.out.println(DsalgoVariables.python_code);
			
			action.sendKeys(DsalgoVariables.python_code).perform();
			action.sendKeys(Keys.ENTER).perform();
			action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).sendKeys(Keys.DELETE).perform();
				
		}
		

		TreePage.run_button.click();
		System.out.println("The output is :" +TreePage.output.getText());
		LOGGER.info("The output is :" +TreePage.output.getText());
		
	}	*/

}

}
