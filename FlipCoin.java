package com.bridgelabz.flip;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
	
		int loopCount = 1;
		int numFlips=10;
		double result;
		int heads=0;

		while(loopCount < numFlips){
		result=Math.random();
		if(result<=.5){heads++;}
		loopCount++;
		}

		int percentHeads = heads/numFlips*100;
		int tails = 0;
		int percentTails = (numFlips-tails)/numFlips*100;
		System.out.println(percentHeads);
	}
}