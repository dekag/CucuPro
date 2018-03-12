package stepDefs;

import java.util.ArrayList;

import org.junit.AssumptionViolatedException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverScript {

	public DriverScript() {
		// TODO Auto-generated constructor stub
	}

	@Before // (cucumber one)
	public boolean setup(Scenario scenario){
		boolean status = false;
		try {
			
			ArrayList<String> scenarioTags = new ArrayList<>();
			scenarioTags.addAll(scenario.getSourceTagNames());
			if (checkForSkipScenario(scenarioTags)) {
				status = false;
				throw new AssumptionViolatedException(
						"The feature 'Feature-01AXX' is not enabled on this appliance, so skipping");
			} else
				status = true;
			// Assume.assumeTrue(true);
			
		} catch (AssumptionViolatedException e) {
			System.out.println("Test Already Passed");
			throw e;
		}
		
		return status;
	}

	/*
	 * @Before public void setup(Scenario scenario) {
	 * System.out.println("Before Scenario");
	 * System.out.println(scenario.getName());
	 * System.out.println(scenario.getSourceTagNames());
	 * System.out.println(scenario.getStatus());
	 * 
	 * }
	 */
		

	@After
	public void afterSetup(Scenario scenario) throws Exception {
		if (setup(scenario)) {
			System.out.println("After Scenario");
			System.out.println(scenario.getName());
			System.out.println(scenario.getSourceTagNames());
			System.out.println(scenario.getStatus());
		}

	}

	/*
	 * @Before public void before(Scenario scenario) throws Exception {
	 * 
	 * my other pre-setup tasks for each scenario.
	 * 
	 * 
	 * // get all the scenario tags from the scenario head. final ArrayList<String>
	 * scenarioTags = new ArrayList<>();
	 * scenarioTags.addAll(scenario.getSourceTagNames());
	 * 
	 * // check if the feature is enabled on the appliance, so that the tests can be
	 * run. if (checkForSkipScenario(scenarioTags)) { throw new
	 * AssumptionViolatedException("The feature 'Feature-01AXX' is not enabled on this appliance, so skipping"
	 * ); } }
	 */

	private boolean checkForSkipScenario(ArrayList<String> scenarioTags) {
		// I use a tag "@Feature-01AXX" on the scenarios which needs to be run when the
		// feature is enabled on the appliance/application
		if (scenarioTags.contains("@Feature-01AXX") && !isTheFeatureEnabled()) { // if feature is not enabled, then we
																					// need to skip the scenario.
			return true;
		}
		return false;
	}

	private boolean isTheFeatureEnabled() {
		return false;
		/*
		 * my logic to check if the feature is available/enabled on the application. in
		 * my case its an REST api call, I parse the JSON and check if the feature is
		 * enabled. if it is enabled return 'true', else return 'false'
		 */
	}

}
