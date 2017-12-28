package runCookes;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FiloConnect {

	Connection connection = null;

	public FiloConnect(String excelPath) {
		Fillo fillo = new Fillo();
		try {
			connection = fillo.getConnection(excelPath);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	public Recordset getTestData(String almID) {

		String strQuery = "Select * from Sheet1 where ALMID =" + almID;
		Recordset recordset = null;
		try {
			recordset = connection.executeQuery(strQuery);
		} catch (FilloException e) {
			e.printStackTrace();
		}
		return recordset;
	}

}
