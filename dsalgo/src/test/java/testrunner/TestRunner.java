package testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	//	@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				features ={"src/test/resources/features"},
				plugin = {"pretty", "html:target/dsalgoproject.html",
						"json:target/dsalgoproject.json",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
				//tags = {"@Tree"},
				
				glue= "dsalgo_stepdefinition",
				dryRun = false,
				monochrome=true,
				publish=true
				)//console output colour
//				tags = "@tag", //tags from feature file
				
				 //location of feature files
				//location of step definition files


		public class TestRunner extends AbstractTestNGCucumberTests{
			
//			@Override
//		    @DataProvider(parallel = true)
//		    public Object[][] scenarios() {
//						
//				return super.scenarios();		
//		    }

		}
	