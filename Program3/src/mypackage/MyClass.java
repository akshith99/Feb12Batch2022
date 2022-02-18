package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number: ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt(); 		
		if(n%2 == 0) {
			System.out.println("The Number is Even");

		}
		else {
			System.out.println("The Number is Odd");
		}
		obj.close();
		
	}

}
