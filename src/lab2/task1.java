package lab2;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();

		System.out.println("rest = " + number % 3);

		if (number % 3 == 0) {
			System.out.println("Your number is divisible by 3");
		}
		else{
			System.out.println("Your number is NOT divisible by 3");
		}
	}
}
