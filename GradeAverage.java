package com.haktanozgur.patikaDev;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik notu : ");
		double math = scanner.nextDouble();
		System.out.println("Fizik notu : ");
		double physics = scanner.nextDouble();
		System.out.println("Kimya notu : ");
		double chemical = scanner.nextDouble();
		System.out.println("Türkçe notu : ");
		double turkish = scanner.nextDouble();
		System.out.println("Tarih notu : ");
		double history = scanner.nextDouble();
		System.out.println("Müzik notu : ");
		double music = scanner.nextDouble();
		
		double average = (math + physics + chemical + turkish + history + music) / 6;
		
		System.out.println("Not Otalaması : " + average);
		
		if (average >= 60) {
			System.out.println("Geçtiniz...");
		}
		else {
			System.out.println("Kaldınız...");
		}
		
	}
}
