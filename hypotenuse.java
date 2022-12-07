package com.haktanozgur.patikaDev;

import java.util.Scanner;

public class hypotenuse {

    public static void main(String[] args) {
	
	    double a,b,c;
	    Scanner scanner =new Scanner(System.in);

	    System.out.println("Birinci dik kenarı giriniz:");
	    a=scanner.nextDouble();
    	System.out.println("İkinci dik kenarı giriniz:");
    	b=scanner.nextDouble();

    	c=Math.sqrt(a*a+b*b);

	    System.out.printf("\nHipotenüs:%.2f",c);

	}
}

