package lab2;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		if(number >= 5 & number <= 10) {
			System.out.println(number + " is in range between 5 and 10");
		}
		else 
			System.out.println(number + " is NOT in range between 5 and 10");
			
	}
}
