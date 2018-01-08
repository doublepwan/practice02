package com.javaex.prob;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		double mean = 0;
		for(int i=0; i<numbers.length; i++){
			System.out.println("숫자 입력 : ");
			numbers[i] = sc.nextInt();
			sum += numbers[i];
			 mean = sum/numbers.length;
		}
		System.out.println("평균 : "+mean);
	}

}
