package com.javaex.prob;

import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력 하세요 : ");
		int money = sc.nextInt();
		
		int divided = 50000;
		int count;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("50000원 : %d개\r\n",count);
		
		divided = 10000;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("10000원 : %d개\r\n",count);
		
		divided = 5000;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("5000원 : %d개\r\n",count);
		
		divided = 1000;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("1000원 : %d개\r\n",count);
		
		divided = 500;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("500원 : %d개\r\n",count);
		
		divided = 100;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("100원 : %d개\r\n",count);
		
		divided = 50;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("50원 : %d개\r\n",count);
		
		divided = 10;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("10원 : %d개\r\n",count);
		
		divided = 5;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("5원 : %d개\r\n",count);
		
		divided = 1;
		count = money/divided;
		money-=(count*divided);
		System.out.printf("1원 : %d개",count);
	}

}
