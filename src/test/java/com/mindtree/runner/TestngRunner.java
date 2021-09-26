package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="Features/all.feature",
	glue={"stepdefinitions."},
plugin= {"html:target/cucumber-reports.html"})

public class TestngRunner extends AbstractTestNGCucumberTests {

}
