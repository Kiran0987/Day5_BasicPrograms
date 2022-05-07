package com.bridgelab.leapyear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		System.out.println("Enter the  year  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		
		if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0))
		{
			System.out.println("Year is Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}
}