package util;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting;

public class ReportUtil {
	
	public static void main(String[] args) throws Exception {
		/*CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setSourceFile("./src/test/resources/cucumber.json");
		results.executeFeaturesOverviewReport();*/
		CucumberUsageReporting report = new CucumberUsageReporting();
		report.setOutputDirectory("target");
		report.setJsonUsageFile("./src/test/resources/cucumber.json");
		report.executeReport();
	
	}
	
	

}
