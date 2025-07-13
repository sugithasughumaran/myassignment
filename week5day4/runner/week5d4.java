package runner;

import based.base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/w5d4.feature"}, 
glue = {"steps","hooks"},dryRun = false, 
publish = true,monochrome = true)
public class week5d4 extends base {
	}