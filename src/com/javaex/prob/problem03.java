package com.javaex.prob;

public class problem03 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		String str = "";
		for(int i=0; i<c.length; i++){
			str+=c[i];
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.println(str.replace(' ', ','));
	}

}
