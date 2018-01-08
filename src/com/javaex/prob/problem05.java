package com.javaex.prob;

public class problem05 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {// i를 random배열의 인덱스로 사용
			while (true) {
				// 1부터 45까지 랜덤
				int random = (int) (Math.random() * (45 + 1)) + 1;
				// 중복 여부체크를 위한 변수 선언
				boolean duplicate = false;
				// 배열크기만큼 반복하면서 랜덤하게 발생시킨 숫자와
				// 중복 여부 체크
				for (int k = 0; k < lotto.length; k++) {
					if (random == lotto[k]) {// 중복된 경우
						duplicate = true;
						break;
					}
				}

				// 중복되지 않은 경우
				// 랜덤하게 발생시킨 숫자를 i번째 방에 저장
				if (!duplicate) {
					lotto[i] = random;
					break;
				}

			}///while문
			System.out.println(lotto[i]);
		}///for

	}

}
