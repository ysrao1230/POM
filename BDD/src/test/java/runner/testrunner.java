package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/Features/login.feature",
	glue = { "Stepdefinition"},
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
    monochrome = true)

public class testrunner {
	@AfterClass
	public static void ExtentReport() {
		Reporter.loadXMLConfig(new File("config/report.xml"));
	}
}
