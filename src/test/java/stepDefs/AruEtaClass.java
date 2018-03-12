package stepDefs;

public class AruEtaClass {

	static int i = 9;

	public void x() {
		System.out.println(i);
	}

	protected void y() {

	}

	public static void main(String[] args) {
		AruEtaClass obj = new AruEtaClass();
		obj.x();
		i = 10;
		System.out.println(i);

	}

}
