package runCookes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/html-report","json:target/cucumber.json"},
	    features = {"."},
	    //Test File
	    glue = {"stepDefs"}

)
public class TestRunner {	
}

