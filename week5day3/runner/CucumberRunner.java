package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/week5day3.feature"}, glue = {"steps"}, publish = true, monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
