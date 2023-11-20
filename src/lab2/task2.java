package lab2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();

		if(number % 5 == 2) {
			System.out.println(number + " / 5 has rest 2");
		}
		if(number % 7 == 1) {
			System.out.println(number + " / 7 has rest 1");
		}
		if((number % 5 != 2) & (number % 7 != 1)) {
			System.out.println("The number does NOT meet any criteria");
		}
	}

}
