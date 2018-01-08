package com.javaex.prob;

public class problem05 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			while (true) {
				
				int random = (int) (Math.random() * (45 + 1)) + 1;
				
				boolean duplicate = false;
				
				for (int k = 0; k < lotto.length; k++) {
					if (random == lotto[k]) {
						duplicate = true;
						break;
					}
				}

				
				if (!duplicate) {
					lotto[i] = random;
					break;
				}

			}///while
			System.out.println(lotto[i]);
		}///for

	}

}
