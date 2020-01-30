package batchTest;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="demo28Jan.feature",glue= {"stepGlue"},tags= {"@Datadriven"},plugin="json:target/cucumber-report.json")

public class TestRunner
{
	
}
