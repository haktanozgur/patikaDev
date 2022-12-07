package com.haktanozgur.patikaDev;

import java.util.Scanner;

public class OddNumber {
	
    public static void main(String[] args) {
    	
    	int input = 0;
    	int toplam = 0;
    	Scanner scanner = new Scanner(System.in);

    	while(input % 2 == 0){
    		
           input = scanner.nextInt();
    		
           if(input % 2 == 0) {
    	   toplam += input;
           }
    		
    	}
		System.out.println("Çift sayıların toplamı : "+toplam);	       		
    		
    }
}


