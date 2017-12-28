package stepDefs;

import com.codoid.products.fillo.Recordset;

public class TestData {
	
	public String ALMID;
	Recordset data;
	
	public String getALMID() {
		return ALMID;
	}
	public void setALMID(String aLMID) {
		ALMID = aLMID;
	}
	public Recordset getData() {
		return data;
	}
	public void setData(Recordset testData) {
		this.data = testData;
	}

	

}
