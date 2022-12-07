package com.haktanozgur.patikaDev;

import java.util.Scanner;

public class loopCase {
	
	public static void method(int input) {
		for(int i = 4; i <= input; i*=4 ) {
            System.out.println(i);
		}
		for(int j =5; j<=input; j*=5) {
			System.out.println(j);
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		int input = scanner.nextInt();
		method(input);
	}
}
