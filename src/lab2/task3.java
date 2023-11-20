package lab2;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		if(number > 9 & number % 4 == 0) {
			System.out.println(number + " > 10 and divisible by 4");
		}
		else {
			if (number < 10) {
			System.out.println(number + " < 10");
			}
			if (number % 4 != 0) {
				System.out.println(number + " is NOT divisiable by 4");
				}
			}
		
	}

}
