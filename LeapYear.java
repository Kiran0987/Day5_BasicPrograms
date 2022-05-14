package com.bridgelab.leapyear;

public class LeapYear {
	public static void main(String[] args) {

        int num = 2020;
		
		if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0))
		{
			System.out.println("Year is Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}
}