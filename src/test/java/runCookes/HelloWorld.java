package runCookes;

import com.codoid.products.fillo.Recordset;

public class HelloWorld {
	public static void main(String[] args) {
		try {
			FiloConnect connect = new FiloConnect("E:\\Learning\\testData.xlsx");
			Recordset testData = connect.getTestData("23412");
			System.out.println(testData.getFieldNames());
			while (testData.next()) {
				System.out.println(testData.getField("Data5"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
