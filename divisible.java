package com.haktanozgur.patikaDev;


import java.util.Scanner;

public class divisible {

	public static void method(int input) {
		for(int i = 1; i <= input; i++) {
			if(i%3 == 0 && i%4 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		int input = scanner.nextInt();
		method(input);
	}
}
