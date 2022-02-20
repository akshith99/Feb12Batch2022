package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = new int[5];
		int sum = 0, avg;
		Scanner obj = new Scanner(System.in);
		
		for(int i = 0; i<data.length; i++) {
			System.out.println("Enter the number: ");
			data[i] = obj.nextInt();
		}
		
		for(int d: data) {
			sum+=d;
			avg = sum/data.length;
			System.out.println("The sum is "+sum +" The average is " +avg);
		}
		
		obj.close();

	}

}
