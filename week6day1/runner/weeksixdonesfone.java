package runner;

import based.base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/week6day1.feature"}, 
glue = {"steps","hooks"},dryRun = false, 
publish = true,monochrome = true)
public class weeksixdonesfone extends base {

}
