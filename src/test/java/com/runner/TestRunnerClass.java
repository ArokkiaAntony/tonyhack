package com.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@CancelBooking"),dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,plugin= {"usage","json:target\\Output.json"}, features="src\\test\\resources",glue="com.StepDefinition")
public class TestRunnerClass {

	
	
	
	
	
	
	
}


