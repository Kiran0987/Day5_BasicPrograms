package com.bridgelabz.power;

public class PowerofTwo {
	public static void main(String[] args) {
		
		int value = 5;
		int exponent = 1;
		if(value<31)
		{
			for (int i = 1; i <= value; i++)
			{
				exponent = exponent * 2;
			}
			System.out.println( " 2 power of " + value + " is : "  + exponent);
		} 
		else
			System.out.println("Invalid input : Enter the  exponential value of 2 less than 31");
	}
}
