package runner;

import based.week6d1base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/w6d1.feature"}, 
glue = {"steps","hooks"},dryRun = false, 
publish = true,monochrome = true)
public class week6d1 extends week6d1base {
	}