package com.bridgelabz.flip;

public class FlipCoin {
	public static void main(String[] args) {
		int num = 20;
		int  head_cnt = 0, tail_cnt = 0;
		double heads, tails;

		for (int i = 0; i < num; i++) {
			double random = Math.random();
			if (random < 0.5)
				tail_cnt++;
			else
				head_cnt++;
		}

		heads = head_cnt / (double) num * 100;
		tails = tail_cnt / (double) num * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
	}
}