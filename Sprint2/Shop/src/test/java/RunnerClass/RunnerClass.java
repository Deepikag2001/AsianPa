package RunnerClass;

import HomePageFactory.PageFactory1;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features="src\\test\\resources\\Features\\HomePage.feature",
glue="HomePageStepDefinition",
//tags= " @BlogFilter")

//tags="@valid or @invalid",
//monochrome=true,
plugin = {"pretty","html:target/HTMLReports/AsianPaintReport3.html",
		"json:target/JSONReports/AsianPaintReport.json",
        "junit:target/JUNITReport/AsianPaintReport.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass extends AbstractTestNGCucumberTests{ 
	
	 
}