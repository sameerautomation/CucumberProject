package Runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue= {"Stepdefinitions"}, monochrome=true,
plugin = {"json:target/cucumber.json"}, dryRun=false)
public class TestRunner 
{

}
