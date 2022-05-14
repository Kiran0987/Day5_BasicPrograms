package com.bridgelab.coinflip;

public class Flip_Coin {
	public static void main(String[] args) {
		int value = 20;
		int head_Count=0;
		int tail_Count=0;
		double head,tail;

		for (int i = 0; i < value; i++) {
			double random = Math.random();
			if (random < 0.5) 
				tail_Count++;
			else 
				head_Count++;
		}

		head = head_Count / (double) value * 100;
		tail = tail_Count / (double) value * 100;
		System.out.println("Percentage of heads: " + head + "%");
		System.out.println("Percentage of tails: " + tail + "%");
	}
}
