package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[5];
		Scanner obj = new Scanner(System.in);
		//using the for loop
		for(int i = 0; i<5; i++) {
			System.out.println("Enter the number: ");
			data[i] = obj.nextInt();
		}
		for(int i = 0; i<5; i++) {
			System.out.println(data[i]);
		}
		
		// using for each loop
		for(int d:data) {
			System.out.println(d);
		}
		obj.close();
	}

}
