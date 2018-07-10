package stepDefs;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//get data from system
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Sentence !! ");
		String data = sc.nextLine();
		System.out.println("My Data " +data);
		sc.close();
	}

}
