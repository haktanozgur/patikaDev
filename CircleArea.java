package com.haktanozgur.patikaDev;

import java.util.Scanner;

public class CircleArea {

	  public static void main(String[] args) {
		    int r;
		    double area,surroundings,pi = 3.14;
		    
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Daire yarı çapını giriniz : ");
		    r = scanner.nextInt();
		    surroundings = 2 * pi * r;
		    area = pi * (r*r);
		    System.out.println("Dairenin Alanı : " + area);
		    System.out.println("Dairenin Çevresi : " + surroundings);
	 }
}
