package stepDefs;

import com.codoid.products.fillo.Recordset;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import runCookes.FiloConnect;

public class HelloStepDef2 {

	String data;
	TestData objData;	
	
	public HelloStepDef2(TestData data) {		
		this.objData = data;
	}
	
	@When("^User check for TestData1$")
	public void user_check_for_TestData() throws Throwable {
		System.out.println("TestData1");
		System.out.println("From Step22222 "+objData.getData().getField("Data1"));
		while (objData.getData().next()) {
			System.out.println("From Step22222 "+objData.getData().getField("Data1"));	
		}
				
	}


}
