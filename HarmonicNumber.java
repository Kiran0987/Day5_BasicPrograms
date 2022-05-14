package com.bridgelabz.harmonic;

public class HarmonicNumber {
	public static void main(String[] args) {
		
		int num = 6;
		System.out.println("The Harmonic Series Number is ");
		double result = 0;
		while(num > 0)
		{
			result = result +  (double )1/num ;
			num--;
			System.out.println(result + "  ");

		}
	}
}
	
