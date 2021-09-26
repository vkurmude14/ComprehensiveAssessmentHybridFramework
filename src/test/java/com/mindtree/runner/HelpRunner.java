package com.mindtree.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
	features="Features/HelpBtn.feature",
	glue={"stepdefinitions"},
plugin= {"html:target/cucumber-reports.html"})
public class HelpRunner {

	

}
