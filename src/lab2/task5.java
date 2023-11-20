package lab2;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		int thousand = number / 1000;
		if(thousand < 0) thousand = -thousand;
		if (number < 1000 & number > -1000)
			System.out.println(number + " has NOT thousands");
		else if (number < 2000 & number > -2000)
			System.out.println("There is " +thousand +" thousand in " + number);
		else 
		System.out.println("There are " + thousand + " thousands in " + number);
	}

}
