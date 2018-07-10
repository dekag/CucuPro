package stepDefs;

import com.codoid.products.fillo.Recordset;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runCookes.FiloConnect;

public class HelloStepDef {

	Recordset testData = null;
	TestData objData;
	
	public HelloStepDef(TestData objData) {
		this.objData = objData;
		try {			
			FiloConnect connect = new FiloConnect("E:\\Learning\\testData.xlsx");
			testData = connect.getTestData("23412");
			System.out.println(testData.getFieldNames());
			objData.setData(testData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("^i have (\\d+) dollars? with me$")
	public void i_have_dollars_with_me(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg1);
	}
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.println("I want to write a step with precondition");
		while (objData.getData().next()) {
			System.out.println("From Step11111 "+objData.getData().getField("Data1"));	
		}
			    
	}
	
	@Given("^I want to write a step with precondition1$")
	public void i_want_to_write_a_step_with_precondition1() throws Throwable {
		System.out.println("I want to write a step with precondition");
		while (objData.getData().next()) {
			System.out.println("From Step11111 "+objData.getData().getField("Data1"));	
		}
			    
	}
	
	@When("^User check for TestData$")
	public void user_check_for_TestData() throws Throwable {
		System.out.println("User check for TestData");
		System.out.println("From Step1 "+objData.getData().getField("Data1"));
		System.out.println("User check for TestData");
		
	}
	@When("^User check for TestData123$")
	public void justtotestdeleteAfterSometime() throws Throwable {
		System.out.println("User check for TestData");
		System.out.println("From Step1 "+objData.getData().getField("Data1"));
		System.out.println("User check for TestData");
		
	}


}
